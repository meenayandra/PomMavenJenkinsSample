package com.edureka.testPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.edureka.uiPackage.FlightConfirmationPage;
import com.edureka.uiPackage.FlightFinderPage;
import com.edureka.uiPackage.LoginPage;
import com.edureka.uiPackage.SelectFlightPage;

import pommavenjenkins.BookFlightPage;
import pommavenjenkins.BrowserFactory1;
import pommavenjenkins.CaptureScreenShot;
 
public class TestCaseClass extends HelperClass {
 
public TestCaseClass(){
}
 
@Test
public void returnTicket() {
try {
System.out.println("in returnTicket");
//String url= "http://google.com";
String url= "http://demo.guru99.com/test/newtours/";
driver.get(url);
LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
loginPage.loginWordPress("mercury", "mercury");
FlightFinderPage flightFinderpage =  PageFactory.initElements(driver, FlightFinderPage.class);
flightFinderpage.continueWordPress("1","Zurich","July","12","Frankfurt","September","15","Business Class","Unified Airlines");
//selectFlightPage.departAirlineWordPress("Pangaea Airlines 362");
//selectFlightPage.returnAirlineWordPress("Unified Airlines 363");
//selectFlightPage.continu();

System.out.println("in BookFlight Scrren");
//BookFlightPage bookFlightPage = PageFactory.initElements(driver, BookFlightPage.class);
System.out.println("in BookFlight Scrren");
//bookFlightPage.purchasePress("Anirudh", "AS", "Vegetarian", "MasterCard", "12345678", "12", "2008", "Anirudh", "A", "S");
//bookFlightPage.Home();
FlightConfirmationPage flightConfirmationPage = PageFactory.initElements(driver, FlightConfirmationPage.class);
//String bookingDetailsFile = System.getProperty("user.dir")+"\"+"ScreenShotsFlightConfirmationDetails - "+CaptureScreenShot.getDateTimeStamp()+".png";
//try {CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), bookingDetailsFile);
//} catch (Exception e) {e.printStackTrace();
//}
flightConfirmationPage.logoutPress();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();}
SelectFlightPage selectFlightPage =  PageFactory.initElements(driver, SelectFlightPage.class);
selectFlightPage.loginWordPress("mercury","mercury");

}}



 


