package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
	public ButtonsPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath=".//h1[text()='BUTTON CLICKS']") 
	 public static WebElement ButtonClicks;
	 
	 @FindBy(xpath=".//p[text()='CLICK ME!']") 
	 public static WebElement clickme;
	 @FindBy(xpath="//span[text()='CLICK ME!!']") 
	 public static WebElement clickmee;
	
	 @FindBy(xpath="//span[text()='CLICK ME!!!']") 
	 public static WebElement clickmeee;
	 
	 
	 @FindBy(xpath=".//*[@id='myModalClick']//button[text()='Close']") 
	 public static WebElement close1;
	 
	 @FindBy(xpath=".//*[@id='myModalJSClick']//button[text()='Close']") 
	 public static WebElement close2;
	 @FindBy(xpath=".//*[@id='myModalMoveClick']//button[text()='Close']") 
	 public static WebElement close3;
	 
	 
	
	
	
	 

}
