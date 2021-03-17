package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminModule {
	
	WebDriver driver;
	
	String expectedurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	
	@Given("user on login page")
	public void user_on_login_page() {
	   
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome88\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    System.out.println("***************************");
	}

	@When("user enter correct username {string} and password {string}")
	public void user_enter_correct_username_and_password(String username, String password) {
		
		driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys(username);
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
		
		driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("display the hrm home page")
	public void display_the_hrm_home_page() {
		
		String title = driver.getTitle();
		
		System.out.println(title);
	   
	}

	@Then("verify the current url of home page")
	public void verify_the_current_url_of_home_page() {
		
        String url = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedurl, url);
	    
	}
	
	@Then("user logout the page")
	public void user_logout_the_page() {
	   driver.quit();
	}

	

}
