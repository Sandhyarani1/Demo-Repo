package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	static WebDriver driver;
	@When("^User clicks on Sign in$")
	public void user_clicks_on_Sign_in() throws Throwable 
	{ 
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(200);
		WebElement login= driver.findElement(By.xpath("//span[@class='nav-line-1' and contains(text(), 'Hello')]"));
	
		Actions act=new Actions(driver);
		act.moveToElement(login).build().perform();
		Thread.sleep(300);
		driver.findElement(By.xpath(" //div[@id='nav-flyout-ya-signin']//a[@class='nav-action-button' and //@data-nav-role='signin']")).click();
	 
	    
	}

	@Then("^User Enters Username and password$")
	public void user_Enters_Username_and_password() throws Throwable
	{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8792348457");
		   // driver.findElement(By.id("continue")).click();
		    driver.findElement(By.id("ap_password")).sendKeys("Anagha$123");
		 
	}

	@Then("^Clicks on Sign In$")
	public void clicks_on_Sign_In() throws Throwable 
	{ 
		   driver.findElement(By.id("signInSubmit")).click();
		   System.out.println(driver.getTitle());
	   
	}

	@Then("^User is verified by the Username$")
	public void user_is_verified_by_the_Username() throws Throwable 
	{
		Boolean user=driver.findElement(By.xpath("//span[@class='nav-line-1'and contains(text(),'Deliver to Sandhya')]")).isDisplayed();
	    if(user==true)
	    {
	    	System.out.println("Correct User is displayed");
	    }
	    else
	    {
	    	System.out.println("Correct user is not displayed");
	    }
	    
	    driver.quit();
	}
 
	

	
	
	
	}
