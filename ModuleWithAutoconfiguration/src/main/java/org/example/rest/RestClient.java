package org.example.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class RestClient implements SimpleClient {

  private static final String EXAMPLE_COM = "http://example.com";

  private final RestTemplate restTemplate;

  public RestClient(final RestTemplate restTemplate) {this.restTemplate = restTemplate;}

  @Override
  public String retrieveSomeData() {
    return restTemplate.exchange(
        EXAMPLE_COM,
        HttpMethod.GET,
        new HttpEntity<>(""),
        String.class).getBody();
  }
}
