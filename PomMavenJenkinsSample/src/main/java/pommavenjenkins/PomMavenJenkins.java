package pommavenjenkins;
  import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
		 
		public class PomMavenJenkins{
			public WebDriver driver;
					
		public void testgooglrsearch(){
			
		System.setProperty("webdriver.chrome.driver", "C:\\Meena\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		 driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		//it will open the goggle page
		 driver.get("https://www.google.com"); 
		//we expect the title �Google � should be present 
		String Expectedtitle = "Google";
		//it will fetch the actual title 
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		Assert.assertEquals(Actualtitle, Expectedtitle);
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		//driver.findElement(By.id("Sign in")).click(); 
		//driver.findElement(By.className("Sign in")).click();
		String url = "https://accounts.google.com/signin";
		driver.get(url);
		}
		 @AfterSuite
		    public void tearDown() {
		        driver.close();
		    }
		}
 
