package com.caps.dev.java.autowiring;

import org.springframework.stereotype.Component;

//@Component
public class SoftwareTester implements Job {
	public void job() {
		System.out.println("Test test test");
	}
}