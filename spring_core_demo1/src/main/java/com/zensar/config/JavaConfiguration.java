package com.zensar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zensarr.beans.Student;
    @Configuration
	@ComponentScan("com.zensar.beans")
    @PropertySource(value= { "data.properties" })
	public class JavaConfiguration 
	{
	@Bean
	
	public Student student() {
	return new Student(1000,"Jayshri",18);
	}
	}



