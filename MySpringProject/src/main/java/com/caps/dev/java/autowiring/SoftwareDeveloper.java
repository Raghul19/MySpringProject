package com.caps.dev.java.autowiring;

import org.springframework.stereotype.Component;

@Component
public class SoftwareDeveloper implements Job {
	public void job() {
		System.out.println("Codes Codes Codes");
	}
}