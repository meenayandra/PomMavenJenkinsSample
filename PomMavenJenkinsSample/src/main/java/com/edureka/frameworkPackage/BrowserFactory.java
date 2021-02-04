package com.edureka.frameworkPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
//}
return driver;
}
 @BeforeTest
public static WebDriver getDriver(String browserName){
if(driver==null){
}else if(browserName.equalsIgnoreCase("chrome")){
System.out.println("in chrome");
System.setProperty("webdriver.chrome.driver", "C:\\Meena\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
}
return driver;
}
}
 