package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginamazon

{
	static WebDriver driver;
	
	@Given("^User navigates to amazon page Url$")
	public void user_navigates_to_amazon_page_Url() throws Throwable 
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

	@When("^User enters Username \"([^\"]*)\" and Password \"([^\"]*)\"Credentails$")
	public void user_enters_Username_and_Password_Credentails(String Username, String Password) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Username);
		   // driver.findElement(By.id("continue")).click();
		    driver.findElement(By.id("ap_password")).sendKeys(Password);
		    driver.findElement(By.id("signInSubmit")).click();
		    System.out.println(driver.getTitle());
		    if(driver.getTitle().equalsIgnoreCase("Amazon Sign In"))
		    {
		    	System.out.println("User is in Unable to Login to amazon");
		    }
		    
		    else 
		    {
		    	System.out.println("User is able to Login Successfully");
		    }
	  
	}
	

	@Then("^Login page of the current user should be displayed$")
	public void login_page_of_the_current_user_should_be_displayed() throws Throwable 
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
