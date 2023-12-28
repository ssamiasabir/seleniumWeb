package com.agiletech;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import net.bytebuddy.asm.Advice.This;

public class PageObjectModelLogin {

// 1: create a Webdriver driver;
	
	WebDriver driver;

	
	
// 2: create properties of the WebElements
// properties




	//*[@class='form_input' and @id='user-name'] ************************* HERE I JOINT TWO VARIABLES WITH AND 
	
// username
	@FindBy(xpath = "//*[@class='form_input' and @id='user-name']")
	WebElement userName;
	
// password
	@FindBy(xpath = "//*[@class='form_input' and @id='password']")
	WebElement passWord;
	
// login Button
	@FindBy(xpath = "//*[@class='btn_action' and @id='login-button']")
	WebElement loginButton;
	
// check logo

	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement logo;
	
	////div[@class='app_logo']
	
// Count products
	
	//div[@class='inventory_container']
	
	@FindBy(xpath = "//div[@class='inventory_list']")
	WebElement countProducts;
	
// 3: constructor created
	
	public PageObjectModelLogin(WebDriver driver) {
    this.driver= driver;
    PageFactory.initElements(driver, this);
    
	}

//4: create methods
	
	public void enterUsername(String Username) {
		userName.sendKeys(Username);
		}
	
	public void enterPassword(String password) {
		passWord.sendKeys(password);
	}



	public void submitButton() {
		loginButton.click();
	
	}
	
	void checkLogoisPresent() {
		boolean ispresend = logo.isDisplayed();
		if(ispresend) {
			System.out.println("Login is Present");
		}else {
			System.out.println("Login is not Present");
		}

	}
		
// countProducts
		void checkLlogoisPresent(int expectedProduct) throws IOException	{
	WebElement inventory = driver.findElement(By.xpath("//div[@class='inventory_list']"));
	ArrayList<WebElement> items = (ArrayList<WebElement>)inventory.findElements(By.className("inventory_item"));
	
	int actualProduct = items.size();
	if(expectedProduct == actualProduct) {}
	else {
		System.out.println("product Count not match");
} 
		
	
	String productTittle = driver.getTitle();
	System.out.println(productTittle);
	
	
	
	
	
	
	
		}
	
	
	}








