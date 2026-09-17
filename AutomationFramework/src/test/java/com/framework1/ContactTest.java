package com.framework1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContact() {

		String BROWSER = System.getProperty("browser");
		String UN = System.getProperty("username");
		System.out.println(BROWSER);
		System.out.println(UN);
		
		System.out.println("Execute Create contact");

	}

	@Test
	public void editContact() {
		System.out.println("Execute edit contact");

	}
}
