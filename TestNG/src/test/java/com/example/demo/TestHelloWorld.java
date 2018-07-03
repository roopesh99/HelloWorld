package com.example.demo;

import org.testng.Assert;

import org.testng.annotations.Test;
import com.example.demo.RandomEmailGenerator;
public class TestHelloWorld {

	@Test()
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");

	}

}