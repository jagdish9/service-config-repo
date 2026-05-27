package com.config.serviceconfigrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfigRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigRepoApplication.class, args);
	}

}
