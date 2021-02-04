package com.edureka.uiPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class FlightConfirmationPage {
 
WebDriver driver;
 
public FlightConfirmationPage(WebDriver driver){
this.driver=driver;
}
 
@FindBy(how=How.XPATH,using="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
WebElement BACKTOHOME;
 
public void logoutPress(){
//logout.click();
	BACKTOHOME.click();
}
}
