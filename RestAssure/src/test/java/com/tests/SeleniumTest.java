package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void testUrl() {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://jsonplaceholder.typicode.com");
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			Assert.assertTrue(currenturl.contains("jsonplaceholder"));
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			driver.quit();
		}
	}

}
