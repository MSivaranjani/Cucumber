package baseDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class BaseClass {
	public static WebDriver driver;
	public static BaseClass base;
	public BaseClass() throws MalformedURLException, InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", "/Users/sivaranjani/Downloads/Firefox/geckodriver");
		driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
		System.out.println("driver value"+driver);
	
	}
public static WebDriver getDriver()
{
	return  driver ;
}
public static void setDriver() throws InterruptedException 
{
	System.out.println("base value"+base);
	if(base==null)
	{
		try {
			base= new BaseClass();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public void check()
{
	//Tap to an element for 250 milliseconds
	
}
}
