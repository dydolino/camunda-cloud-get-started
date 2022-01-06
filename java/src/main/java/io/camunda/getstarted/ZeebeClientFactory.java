package io.camunda.getstarted;

import io.camunda.zeebe.client.ZeebeClient;

public class ZeebeClientFactory {

  public static ZeebeClient getZeebeClient() {
    return ZeebeClient.newCloudClientBuilder()
        .withClusterId("d68e2f0b-6d57-441c-8c0a-41f8209bedd5")
        .withClientId("ng_vrkwUG.ANQMB59WRYgZ7wl6sf40-w")
        .withClientSecret("F0JTyqORGrItZ3lAWs5HzfJjBlsVO0qfqo1Fv-Ufi2IRU9LyXJpHjxX30ouMKcgM")
        .withRegion("bru-2")
        .build();
  }

}
