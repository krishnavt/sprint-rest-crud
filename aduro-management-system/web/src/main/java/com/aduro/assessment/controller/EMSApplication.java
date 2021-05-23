package com.aduro.assessment.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.aduro.*" })
@EntityScan(basePackages = { "com.aduro.*" })
@EnableJpaRepositories(basePackages = { "com.aduro.*" })
@EnableJpaAuditing
public class EMSApplication {

	public static void main(String[] args) {

		SpringApplication.run(EMSApplication.class);
	}
}
