package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.dataStructure;

public class ninjaDataStructure extends BaseClass {
	
		
	@Given("The user navigates to Home Page {string}")
	public void the_user_navigates_to_home_page(String url) throws InterruptedException {
		ds=new dataStructure(driver);
	   	driver.get(url);
	   	Thread.sleep(3000);
	}
	
	

	@When("user click on Get started button in Data Structure page")
	public void user_click_on_get_started_button_in_data_structure_page() {
	    ds.clickOnGetStarted();
	}

	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String string) {
	    ds.dstitle();
	}

	@When("user click on Time Complexity link")
	public void user_click_on_time_complexity_link() {
	    ds.clickOntimecomplex();
	}

	@When("user click on Try here button")
	public void user_click_on_try_here_button() {
	    ds.clickOntryheredata();
	}

	@When("user enter the code")
	public void user_enter_the_code() throws InterruptedException {
	    ds.entertextdata();
	}

	@When("click on run button")
	public void click_on_run_button() {
	    ds.clickOnrundata();
	}
	
	@When("click on back button")
	public void click_on_back_button() {
	    ds.clickOnback();
	}

	@Then("user is navigated to home page {string}")
	public void user_is_navigated_to_home_page(String string) {
	    ds.pagetilte2();
	}


}
