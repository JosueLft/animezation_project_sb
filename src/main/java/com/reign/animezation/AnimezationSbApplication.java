package com.reign.animezation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.reign.animezation.entities"})
@EnableJpaRepositories(basePackages = {"com.reign.animezation.repositories"})
public class AnimezationSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimezationSbApplication.class, args);
	}

}
