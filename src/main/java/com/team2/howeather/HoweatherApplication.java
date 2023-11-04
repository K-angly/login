package com.team2.howeather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class HoweatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoweatherApplication.class, args);
	}

}
