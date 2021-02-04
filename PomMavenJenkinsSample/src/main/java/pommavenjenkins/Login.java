package pommavenjenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


    public class Login extends PomMavenJenkins{
    	
    	
	@Test
	 public void loginpage()
	 {	 
   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
	email_phone.sendKeys("your_email_phone");
	driver.findElement(By.id("identifierNext")).click();
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(password));
	password.sendKeys("your_password");
	driver.findElement(By.id("passwordNext")).click();
	}
}


