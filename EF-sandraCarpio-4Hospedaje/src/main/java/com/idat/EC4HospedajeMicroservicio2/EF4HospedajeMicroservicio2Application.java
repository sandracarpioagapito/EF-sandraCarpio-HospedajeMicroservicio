package com.idat.EC4HospedajeMicroservicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EF4HospedajeMicroservicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(EF4HospedajeMicroservicio2Application.class, args);
	}

}
