package com.spring.acc.skyapp.skyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SkyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyappApplication.class, args);
	}

}
