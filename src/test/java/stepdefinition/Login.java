package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given ;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Given("user open the browser")
	public void user_open_the_browser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome88\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    System.out.println("***************");
	    
	}

	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.findElement(By.id("txtUsername")).clear();
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).clear();
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    
	    
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("home page should be display")
	public void home_page_should_be_display() {
		
	boolean image =  driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
	
	Assert.assertEquals(true, image);
	    
	}

	@Then("logout")
	public void logout() {
		
		driver.quit();
	    
	}


}
