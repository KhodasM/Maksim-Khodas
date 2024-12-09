package concurrency.repository;

import concurrency.domain.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepositoryRealization implements UserRepository {
  private final Map<String, User> userStore = new ConcurrentHashMap<>();

  @Override
  public User findByMsisdn(String msisdn) {
    return userStore.get(msisdn);
  }

  @Override
  public void updateUserByMsisdn(String msisdn, User user) {
    userStore.put(msisdn, user);
  }
}
