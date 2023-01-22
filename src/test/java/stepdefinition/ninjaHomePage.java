package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.homePage;

public class ninjaHomePage  extends BaseClass{
	
	@Given("user navigates to the dsportalapp webpage {string}")
	public void user_navigates_to_the_dsportalapp_webpage(String url) {
		hp=new homePage(driver);
	   	driver.get(url);
	}

	@When("user clicks on Get Started button in Home")
	public void user_clicks_on_get_started_button_in_Home() {
	   hp.clickOnGetStarted();
	}
	
	
	@Then("The user clicks on data structures dropdown")
	public void the_user_clicks_on_data_structures_dropdown() {
	   hp.clickdropdown();
	}

	@When("The user select any one of the dropdown menu")
	public void the_user_select_any_one_of_the_dropdown_menu() {
	    hp.selectdropdown();
	}

	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String string) {
	    hp.loginalert();
	}

	@When("The user click any of the Get started button in home page")
	public void the_user_click_any_of_the_get_started_button_in_home_page() {
	    hp.clickOngetStarted2();
	}
	
	@Then("It should Alert the user with the message2 {string}")
	public void it_should_alert_the_user_with_the_message2(String string) {
	    hp.loginalert();
	}

	@When("The user click on Register")
	public void the_user_click_on_register() {
	    hp.register();
	}

	@Then("The user should be redirected to Register page")
	public void the_user_should_be_redirected_to_register_page() {
		hp.pagetitle();
		
	}
	
}
