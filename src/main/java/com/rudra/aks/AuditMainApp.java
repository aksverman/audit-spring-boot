package com.rudra.aks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AuditMainApp {

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8088);
		SpringApplication.run(AuditMainApp.class, args);
	}

}
