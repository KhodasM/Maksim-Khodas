package concurrency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import concurrency.domain.User;
import concurrency.domain.Message;
import concurrency.repository.UserRepository;
import concurrency.repository.UserRepositoryRealization;
import concurrency.enrichment.EnrichmentService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class EnrichmentServiceTest {
  private EnrichmentService enrichmentService;
  private UserRepository userRepository;
  private static Map<String, String> content;

  @BeforeEach
  void setUp() {
    userRepository = new UserRepositoryRealization();
    enrichmentService = new EnrichmentService(userRepository);
    content = new HashMap<>();
  }

  @Test
  void shouldEnrichMessageUsingUserDetails() {
    User myFriend = new User("Daniil", "Ognev");
    userRepository.updateUserByMsisdn("89227138866", myFriend);
    content.put("action", "button_click");
    content.put("page", "book_card");
    content.put("msisdn", "89227138866");
    Message message = new Message(content, Message.EnrichmentType.MSISDN);
    Message enrichedMessage = enrichmentService.enrich(message);
    assertEquals("Daniil", enrichedMessage.getContent().get("firstName"));
    assertEquals("Ognev", enrichedMessage.getContent().get("lastName"));
    assertEquals("89227138866", enrichedMessage.getContent().get("msisdn"));
  }

  @Test
  void shouldReturnSameMessage() {
    content.put("action", "button_click");
    content.put("page", "book_card");
    content.put("msisdn", "89227138866");

    Message message = new Message(content, null);
    Message result = enrichmentService.enrich(message);
    assertEquals(content, result.getContent());
  }
}
