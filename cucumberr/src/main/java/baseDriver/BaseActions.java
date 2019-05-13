package baseDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions extends BaseClass {
	public BaseActions() throws MalformedURLException, InterruptedException {
		super();
		
	}



	public static void ExplicitWaittobeclickable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 90);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

public static void click(WebElement element)
{
	element.click();
	
	
}
public static boolean displayed(WebElement element)
{
	return element.isDisplayed();
	
	
}
public static boolean ischecked(WebElement element)
{
	return element.isSelected();
	
	
}
public static void Selectbyvalue(WebElement element,String k)
{
	Select option = new Select(element);
	option.selectByValue(k);
	
	
}
public static void Selectbyindex(WebElement element,int k)
{
	Select option = new Select(element);
	option.selectByIndex(k);
	
	
}
public static void SelectbyVisibleText(WebElement element,String k)
{
	Select option = new Select(element);
	option.selectByVisibleText(k);
	
	
}
 public static void sendKeys(WebElement element,String keys)
{
	element.sendKeys(keys);
}
public static void swipe(WebElement element) throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor)BaseClass.getDriver();
	 Thread.sleep(2000);
	 System.out.println("element");
	 //js.executeScript("window.scrollBy(0,1000)");
	js.executeScript("arguments[0].scrollIntoView();",element);
	js.executeScript("window.scrollBy(0,100)");
}
public static void windowHandles() throws InterruptedException
{
	for(String winHandle : BaseClass.getDriver().getWindowHandles()){
		 BaseClass.getDriver().switchTo().window(winHandle);
		}
}


}
