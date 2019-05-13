package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown {
	
	public DropDown(WebDriver driver) {
		System.out.println("To do list page is initiated");
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//h1[text()='DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)']") 
	 public static WebElement DropdownHead;
	 
	 @FindBy(xpath="//h2[text()='Dropdown Menu(s)']") 
	 public static WebElement DropMenu;
	 
	 @FindBy(id="dropdowm-menu-1") 
	 public static WebElement DropMenu1;
	 
	 @FindBy(id="dropdowm-menu-2") 
	 public static WebElement DropMenu2;
	 
	 @FindBy(id="dropdowm-menu-3") 
	 public static WebElement DropMenu3;
	
	 @FindBy(xpath="//h2[text()='Checkboxe(s)']") 
	 public static WebElement checkboxes;
	 
	 @FindBy(xpath="//input[@value='option-1']") 
	 public static WebElement check1;
			 
	 @FindBy(xpath="//h2[text()='Radio Button(s)']") 
	 public static WebElement RadioButtons;
	 
			 
	 @FindBy(xpath="//input[@value='green']") 
	 public static WebElement green;
	 
	 
	 @FindBy(xpath="//input[@value='cabbage']") 
	 public static WebElement cabbage; 
	 
	 @FindBy(xpath="//input[@value='pumpkin']") 
	 public static WebElement pumpkin;
	 @FindBy(id="radio-buttons-selected-disabled") 
	 public static WebElement radiobuttonse; 
	 
	
	 @FindBy(id="fruit-selects") 
	 public static WebElement fruitSelects; 
	 
	 @FindBy(xpath="//option[@value='orange']") 
	 public static WebElement Orange;
			 
			
			 
	
			
			
			
			
			
			
			
			
			
	
			
			
			
}
