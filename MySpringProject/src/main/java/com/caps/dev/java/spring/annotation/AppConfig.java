package com.caps.dev.java.spring.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean(name="person")
	public Person getPerson(@Qualifier("developer") Job job) {
		Person p = new Person();
		p.setName("Banner");
		p.setJob(job);
		return p;
	}
	
	@Bean(name= "developer")
	public Job getJob1() {
		return new SoftwareDeveloper();
	}
	
	@Bean(name="tester")
	@Primary
	public Job getJob2() {
		return new SoftwareTester();
	}
}