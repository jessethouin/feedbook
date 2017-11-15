package com.thouin.feedbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FeedbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbookApplication.class, args);
	}
}
