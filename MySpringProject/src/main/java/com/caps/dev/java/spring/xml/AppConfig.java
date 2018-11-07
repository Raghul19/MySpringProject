package com.caps.dev.java.spring.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="person")
	public Person getPerson() {
		Person p = new Person();
		p.setName("Banner");
		p.setJob(getJob());
		return p;
	}
	
	@Bean
	public Job getJob() {
		return new SoftwareTester();
	}
}