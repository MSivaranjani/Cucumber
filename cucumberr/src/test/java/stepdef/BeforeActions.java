package stepdef;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import baseDriver.BaseClass;
import cucumber.api.java.Before;

public class BeforeActions {
public static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "/Users/sivaranjani/Downloads/Firefox/geckodriver");
		driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.get("http://www.webdriveruniversity.com/");
	}

}
