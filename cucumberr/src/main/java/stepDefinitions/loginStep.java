package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseDriver.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStep {
	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
		WebElement login = BaseClass.getDriver().findElement(By.xpath(".//h1[text()='LOGIN PORTAL']"));


		 JavascriptExecutor js = (JavascriptExecutor)BaseClass.getDriver();
		 Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",login );
		 Thread.sleep(8000);
		 login.click();
		 Thread.sleep(8000);
		 for(String winHandle : BaseClass.getDriver().getWindowHandles()){
			 BaseClass.getDriver().switchTo().window(winHandle);
			}
		
		 
		BaseClass.getDriver().findElement(By.xpath("//*[@id='text']")).sendKeys("admin");
		BaseClass.getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys("admin");
		BaseClass.getDriver().findElement(By.id("login-button")).submit();
		
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	    
	}

	@When("^user enter login$")
	public void user_enter_login() throws Throwable {
	   
	}

	@Then("^User should able to see the alert message$")
	public void user_should_able_to_see_the_alert_message() throws Throwable {
	   
	}


}
