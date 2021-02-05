package com.edureka.frameworkPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
public class BrowserFactory {
	public static WebDriver driver;
	 
	public BrowserFactory(){
	 
	}
	@BeforeTest
	public static WebDriver getDriver(){
	//if(driver==null){
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("--disable-notifications");
	//options.setPageLoadStrategy(PageLoadStrategy.NONE);
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	//}
	return driver;
	}
	 @BeforeTest
	public static WebDriver getDriver(String browserName){
		 DesiredCapabilities cap=new DesiredCapabilities();
		 cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	if(driver==null){
	}else if(browserName.equalsIgnoreCase("firefox")){
	System.out.println("in firefox");
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	driver=new FirefoxDriver(cap);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}
	return driver;
	}
	}


