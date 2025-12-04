package com.fridgebooking.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class FridgeBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridgeBookingSystemApplication.class, args);
	}

}
