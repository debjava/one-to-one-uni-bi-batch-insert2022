package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringOne2OneMain {

	public static void main(String[] args) {
		SpringApplication.run(SpringOne2OneMain.class, args);
	}

}
