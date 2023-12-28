package com.agiletech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductClass {
	WebDriver driver;
	
	
	ProductClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath = "//div[text() = 'Products' and @class='product_label']")
		WebElement productTitle;
			


void checkTitle(String givenTitile) {
	
	String actualTitle= productTitle.getText();
	if(actualTitle.equalsIgnoreCase(givenTitile)) {
		System.out.println("Test is passed");
		
	}else {
		System.out.println("Test Failed");
	}
}
}
	
	


