package org.example.config;

import org.example.rest.RestClient;
import org.example.rest.SimpleClient;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig {

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }

  @Bean
  public SimpleClient simpleClient(RestTemplate restTemplate) {
    return new RestClient(restTemplate);
  }
}
