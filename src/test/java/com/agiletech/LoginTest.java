package com.agiletech;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class LoginTest {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver = BaseClass.getDriver("Edge");
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		PageObjectModelLogin pL = new PageObjectModelLogin(driver);
		ProductClass pc2 = new ProductClass(driver);
	
		
		pL.enterUsername("standard_user");
		pL.enterPassword("secret_sauce");
		pL.submitButton();
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(f,new File("1screenshortswad.jpeg"));
			
		} catch (Exception e) {

		System.out.println("We have exception" + e);
		}
		//FileUtils.copyFile(f,new File("1screenshortswad.jpeg"));
		pL.checkLogoisPresent();
		pL.checkLlogoisPresent(6);
		pc2.checkTitle("Products");
		driver.quit();
		
		
	
		
		
		}
		
		
	}


