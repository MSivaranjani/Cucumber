package stepDefinitions;

import baseDriver.BaseActions;
import baseDriver.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageFactory.DropDown;

public class Dropdown {
	DropDown drop = new DropDown(BaseClass.getDriver());
	@When("^User taps dropdown in landing screen$")
	public void user_taps_dropdown_in_landing_screen() throws Throwable {
		BaseActions.swipe(drop.DropdownHead);
		BaseActions.click(drop.DropdownHead);
	   
	}

	@When("^User should navigate to the dropdown screen$")
	public void user_should_navigate_to_the_dropdown_screen() throws Throwable {
	   BaseActions.windowHandles(); 
	}

	@When("^User selects the (\\d+)st dropdown$")
	public void user_selects_the_st_dropdown(int arg1) throws Throwable {
		Thread.sleep(4000);
		BaseActions.ExplicitWaittobeclickable(drop.DropMenu);
		Assert.assertTrue(BaseActions.displayed(drop.DropMenu));
	
		
	   
	}

	@When("^select an options$")
	public void select_an_options() throws Throwable {
		BaseActions.Selectbyvalue(drop.DropMenu1, "java");
	   
	}

	@When("^User selects the (\\d+)ndt dropdown$")
	public void user_selects_the_ndt_dropdown(int arg1) throws Throwable {
		BaseActions.Selectbyindex(drop.DropMenu2, 2);
	    
	}

	
	@When("^User selects the (\\d+)rd dropdown$")
	public void user_selects_the_rd_dropdown(int arg1) throws Throwable {
		BaseActions.SelectbyVisibleText(drop.DropMenu3, "HTML");
	}

	

	@When("^User selects checkbox$")
	public void user_selects_checkbox() throws Throwable {
		
		BaseActions.ExplicitWaittobeclickable(drop.check1);
		Thread.sleep(4000);
		BaseActions.click(drop.check1);
		Thread.sleep(3000);
		System.out.println("isselected"+drop.check1.isSelected());
	    
	}

	@When("^check the selected is selected$")
	public void check_the_selected_is_selected() throws Throwable {
		//Assert.assertTrue(BaseActions.ischecked(drop.check1));
	    
	}

	@When("^Tap any of the radio button$")
	public void tap_any_of_the_radio_button() throws Throwable {
		Thread.sleep(4000);
		BaseActions.ExplicitWaittobeclickable(drop.green);
		BaseActions.click(drop.green);
	    
	}

	@Then("^check it is selected$")
	public void check_it_is_selected() throws Throwable {
		//Assert.assertTrue(BaseActions.ischecked(drop.green));
	}

	@When("^Select pumpkin$")
	public void select_pumpkin() throws Throwable {
		Thread.sleep(4000);
		BaseActions.ExplicitWaittobeclickable(drop.pumpkin);
	   BaseActions.click(drop.pumpkin);
	}

	@When("^check Cabbage is disabled$")
	public void check_Cabbage_is_disabled() throws Throwable {
		//Assert.assertFalse(BaseActions.displayed(drop.cabbage));
	    
	}

	
	@When("^select grape$")
	public void select_grape() throws Throwable {
		BaseActions.Selectbyvalue(drop.fruitSelects,"grape");
	    
	}

	



}
