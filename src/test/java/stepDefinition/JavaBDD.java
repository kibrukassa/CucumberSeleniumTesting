package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JavaBDD {
	WebDriver driver = new ChromeDriver();
	
	@Given("I open the browser")
	public void i_open_the_browser() {
	   driver.get("https://practicetestautomation.com/practice-test-login/");
	   driver.manage().window().maximize();
	//   driver.close();
	   
	}

	@When("I enter the url {string}")
	public void i_enter_the_url(String string) {
		 driver.get("https://practicetestautomation.com/practice-test-login/");
		   driver.manage().window().maximize();
		  String title = driver.getTitle();
		  System.out.println(title);
	  
	}

	@When("Enter username and password")
	public void enter_username_and_password() {
	   driver.findElement(By.id("username")).sendKeys("student");
	   driver.findElement(By.id("password")).sendKeys("Password123");
	   
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	   driver.findElement(By.xpath("//button[@id='submit']")).click();
	   
	    
	}

	@Then("login will be succesful")
	public void login_will_be_succesful() {
		String message = driver.getTitle();
		System.out.println(message + "successful");
	  
	}


}
