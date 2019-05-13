package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseDriver.BaseClass;

public class loginPage {
	public loginPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath=".//h1[text()='LOGIN PORTAL']") 
	 public static WebElement loginPortal;
	 
	 @FindBy(xpath="//*[@id='text']") 
	 public static WebElement Username;
	 
	 @FindBy(xpath="//*[@id='password']") 
	public  static WebElement password;
	 
	 @FindBy(id="login-button") 
		public  static WebElement loginButton;
	
	 
	

}
