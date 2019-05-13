package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodoListPage {
	public TodoListPage(WebDriver driver) {
		System.out.println("To do list page is initiated");
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//h1[text()='TO DO LIST']") 
	 public static WebElement TodoList;
	 @FindBy(xpath="//input[@placeholder='Add new todo']") 
	 public static WebElement AddNewTodo;
	 @FindBy(xpath=".//*[@id='plus-icon']") 
	 public static WebElement PlusIcon;

	 @FindBy(xpath="//li[text()=' Go to potion class']") 
	 public static WebElement icon;
	 @FindBy(xpath="//li[1]/span/i[@class='fa fa-trash']") 
	 public static WebElement delicon;
	 
	
	
}
