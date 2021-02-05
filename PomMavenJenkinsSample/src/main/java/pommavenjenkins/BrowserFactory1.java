package pommavenjenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class BrowserFactory1 {
 
public static WebDriver driver;
 
public BrowserFactory1(){
 
}
//@BeforeTest
 public static WebDriver getDriver(){
//if(driver==null){
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--disable-notifications");
//options.setPageLoadStrategy(PageLoadStrategy.NONE);
 //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
//}
	
	System.setProperty("webdriver.gecko.driver","geckodriver.exe"); // Setting system properties of FirefoxDriver
	WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
return driver;
}

 @BeforeTest
public static WebDriver getDriver(String browserName){
	 DesiredCapabilities cap=new DesiredCapabilities();
	 cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	 cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

if(driver==null){
}else if(browserName.equalsIgnoreCase("Firefox")){
//System.out.println("in chrome");
//System.setProperty("webdriver.chrome.driver", "C:\\Meena\\chromedriver.exe");
//driver=new ChromeDriver();

System.out.println("in firefox");
System.setProperty("webdriver.gecko.driver","C:\\Users\\bokka\\git\\PomMavenJenkinsSample\\PomMavenJenkinsSample\\geckodriver.exe");
//driver=new ChromeDriver();
driver = new FirefoxDriver(cap);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
}
return driver;
}
}
 