package com.agiletech;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	//public static  WebDriver getDriver() {
	//	WebDriver driver;
	//	driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//	return driver;
		

	
	public static WebDriver getDriver(String drivername) {
		WebDriver driver = null;
		
		switch (drivername) {
	
		case "Chrome":
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			
			break;
			
			
		case "Edge":
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

			
			
			break;
		default:
	
			}
		
		
		return driver;
	}
	}


