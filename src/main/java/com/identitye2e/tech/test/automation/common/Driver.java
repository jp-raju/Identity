package com.identitye2e.tech.test.automation.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver 
{
	public static WebDriver webdriver;
	public static WebDriver getCurrentDriver() {
		if (webdriver == null) {
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			webdriver = new ChromeDriver(options);
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
		}
		return webdriver;
	}
	
	private static class BrowserCleanup implements Runnable {
		public void run() {
			System.out.println("Cleaning up the browser");
			try { 
				webdriver.quit();
			} catch (NullPointerException e) {
				System.out.println("Browser already shut down.");
			}
		}
	}
}

