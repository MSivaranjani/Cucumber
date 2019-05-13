package stepDefinitions;

import baseDriver.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookss {
	public String parent;
	@Before("@first")
	public void user_should_be_on_the_login_screen() throws Throwable {
		BaseClass.setDriver();
		Thread.sleep(3000);
		
	
		BaseClass.getDriver().get("http://www.webdriveruniversity.com/");
		parent = BaseClass.getDriver().getWindowHandle();

	  
	}
	@After
	public void teardown()
	{
		System.out.println("Class"+BaseClass.getDriver());
		System.out.println("after method");
		//BaseClass.getDriver().quit();
		BaseClass.getDriver().switchTo().window(parent);
		
		System.out.println("Browser closed");
	}
}
