package com.edureka.uiPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectFlightPage {
	WebDriver driver;
	public SelectFlightPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.NAME,using="userName")
	@CacheLookup
	WebElement username;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement password;
	@FindBy(how=How.NAME,using="submit")
	@CacheLookup
	WebElement submit;
	 
	public void loginWordPress(String use, String pass) {
	try {
	username.sendKeys(use);
	Thread.sleep(3000);
	password.sendKeys(pass);
	Thread.sleep(3000);
	submit.click();
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	 
	}


