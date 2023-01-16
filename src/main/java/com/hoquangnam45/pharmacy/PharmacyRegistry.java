package com.hoquangnam45.pharmacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PharmacyRegistry {
  public static void main(String[] args) {
    SpringApplication.run(PharmacyRegistry.class, args);
  }
}
