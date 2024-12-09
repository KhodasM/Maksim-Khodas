package concurrency;

import concurrency.domain.User;
import concurrency.domain.Message;
import concurrency.repository.UserRepository;
import concurrency.repository.UserRepositoryRealization;
import concurrency.enrichment.EnrichmentService;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ConcurrencyTest {

  @Test
  void shouldSucceedEnrichmentInConcurrentEnvironmentSuccessfully() throws InterruptedException {
    UserRepository userRepository = new UserRepositoryRealization();
    EnrichmentService enrichmentService = new EnrichmentService(userRepository);

    ExecutorService executorService = Executors.newFixedThreadPool(5);
    CountDownLatch latch = new CountDownLatch(5);

    for (int i = 0; i < 5; i++) {
      executorService.submit(() -> {
        Message message = new Message(new HashMap<>(), Message.EnrichmentType.MSISDN);
        enrichmentService.enrich(message);
        latch.countDown();
      });
    }

    latch.await();
  }
}