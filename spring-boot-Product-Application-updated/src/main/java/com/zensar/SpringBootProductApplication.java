package com.zensar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
@OpenAPIDefinition
@EnableEurekaClient
@EnableFeignClients
public class SpringBootProductApplication {
	//public class SpringBootProductApplication extends SpringBootServletInitializer{

	public static void main(String... args) {
		System.out.println("Jayshri");
		SpringApplication.run(SpringBootProductApplication.class, args);
		System.out.println("Gaikwad");
	}
	//@Override
		 //protected SpringApplicationBuilder configure(SpringApplicationBuilder
		 //builder) {
		 //TODO Auto-generated method stub
		//return super.configure(builder);
		 //}
		@Bean
		public ModelMapper getmodelMapper() {
			return new ModelMapper();

		}

	}



