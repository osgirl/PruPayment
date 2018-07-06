package com.prud.zm.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.prud.zm.controller","com.prud.zm.service","com.prud.zm.persist","com.prud.zm.processor"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories("com.prud.zm.persist")
@EntityScan("com.prud.zm.pojo")
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
}
