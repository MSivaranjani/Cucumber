package stepDefinitions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseDriver.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TodoListStep {
	public WebDriver driver;
	@Before("@first")
	public void user_should_be_on_the_login_screen() throws Throwable {
		BaseClass.setDriver();
		Thread.sleep(3000);
		
	
		BaseClass.getDriver().get("http://www.webdriveruniversity.com/");

	  
	}
	@After
	public void teardown()
	{
		System.out.println("Class"+BaseClass.getDriver());
		System.out.println("after method");
		BaseClass.getDriver().close();
		System.out.println("Browser closed");
	}

	

	@When("^Tap \\+ button$")
	public void tap_button() throws Throwable {
	    
	}

	@When("^add list$")
	public void add_list() throws Throwable {
	    
	}

	@Then("^check list are added$")
	public void check_list_are_added() throws Throwable {
	    
	}

	@When("^Tap the element$")
	public void tap_the_element() throws Throwable {
	   
	}

	@When("^Tap on the delete icon$")
	public void tap_on_the_delete_icon() throws Throwable {
	}

	@Then("^Corresponding item should be deleted$")
	public void corresponding_item_should_be_deleted() throws Throwable {
	    
	}

}
