package com.framework1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContact() {

		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(UN);
		System.out.println(PWD);
		System.out.println("Execute Create contact");

	}

	@Test
	public void editContact() {
		System.out.println("Execute edit contact");

	}
	@Test
	public void deleteContactprogram() {
		System.out.println("Execute delete contact");

	}

	
}
