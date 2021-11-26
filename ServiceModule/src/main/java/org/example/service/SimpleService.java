package org.example.service;

import org.example.rest.SimpleClient;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleService {

  private final SimpleClient client;

  public SimpleService(final SimpleClient client) {this.client = client;}

  @EventListener(ApplicationReadyEvent.class)
  public void printOutput() {
    System.out.println(client.retrieveSomeData());
  }
}
