package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	public ContactPage(WebDriver driver) {
		System.out.println("Contact page is iniated");
	     PageFactory.initElements(driver, this);
	 }
	
	 
	 @FindBy(xpath=".//h1[text()='CONTACT US']") 
	 public static WebElement ContactUs;
	 @FindBy(name="first_name") 
	 public static WebElement firstname;
	 @FindBy(name="last_name") 
	 public static WebElement lastname;
	 @FindBy(name="email") 
	 public static WebElement email;
	 @FindBy(name="message") 
	 public static WebElement message;
	 @FindBy(xpath="//input[@value='RESET']") 
	 public static WebElement Reset;
	 @FindBy(xpath="//input[@value='SUBMIT']") 
	 public static WebElement Submit;
	 

}
