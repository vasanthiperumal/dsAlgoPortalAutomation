package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.stack;

public class ninjaStack extends BaseClass{
	
	@Given("The user is in Ninja home page Stack {string}")
	public void the_user_is_in_ninja_home_page_Stack(String url) {
		sp=new stack(driver);
	   	driver.get(url);
	}
	
	@When("user clicks on Get Started button under Stack")
	public void user_clicks_on_get_started_button_under_stack() {
	    sp.CickongetStartedstack();
	}

	@Then("It should navigate to corresponding stack page with title {string}")
	public void it_should_navigate_to_corresponding_stack_page_with_title(String string) {
	    sp.getTitlestack();
	}

	@When("user clicks on the link Operations in Stack")
	public void user_clicks_on_the_link_operations_in_stack() {
	   sp.CickonOperationsstack();
	}

	@Then("It should navigate to corresponding Operations stack page with title {string}")
	public void it_should_navigate_to_corresponding_operations_stack_page_with_title(String string) {
	    sp.getTitleOperationsstack();
	}

	@When("user click on Try here link in Operations in Stack page")
	public void user_click_on_try_here_link_in_operations_in_stack_page() {
	    sp.Cickonlinktryhere();
	}

	@Then("It should navigate to Operations in Stack Assessment page with title {string}")
	public void it_should_navigate_to_operations_in_stack_assessment_page_with_title(String string)  {
	    sp.getTitleAssesement();
	}

	@When("user enters the code in Stack page")
	public void user_enters_the_code_in_stack_page() throws InterruptedException {
	    sp.entertextdata();
	}

	@When("click on run button in Stack page")
	public void click_on_run_button_in_stack_page() {
	    sp.clickOnrundata();
	}

	@Then("User navigate back in Stack page")
	public void user_navigate_back_in_stack_page() {
	    sp.clickOnback();
	}

	@When("user click on Implementation link in Stack page")
	public void user_click_on_implementation_link_in_stack_page() {
	    sp.Cickonimplementationstack();
	}

	@Then("It should navigate to corresponding Implementation page with title {string}")
	public void it_should_navigate_to_corresponding_implementation_page_with_title(String string) {
	    sp.getTitleimplementationstack();
	}

	@When("user click on Try here  link in Implementation-Stack page")
	public void user_click_on_try_here_link_in_implementation_stack_page() {
	   sp.Cickonlinktryhere();
	}

	@Then("It should navigate to Implementation-stack page with title {string}")
	public void it_should_navigate_to_implementation_stack_page_with_title(String string) {
	    sp.getTitleAssesement();
	}
	
	@When("user enters the code in Implementation page")
	public void user_enters_the_code_in_implementation_page() throws InterruptedException {
	    sp.entertextdata();
	}

	@When("click on run button in Implementation page")
	public void click_on_run_button_in_implementation_page() {
	    sp.clickOnrundata();
	}

	@Then("User navigate back in Implementation page")
	public void user_navigate_back_in_implementation_page() throws InterruptedException {
	    sp.clickOnback();
	    Thread.sleep(200);
	}

	@When("user click on Applications link in Stack page")
	public void user_click_on_applications_link_in_stack_page() {
	    sp.Cickonapplicationstack();
	}

	@Then("It should navigate to corresponding Applications page with title {string}")
	public void it_should_navigate_to_corresponding_applications_page_with_title(String string) {
	    sp.getTitleapplicationstack();
	}

	@When("user click on Try here link in Applications-Stack page")
	public void user_click_on_try_here_link_in_applications_stack_page() {
	    sp.Cickonlinktryhere();
	}

	@Then("It should navigate to Applications-stack page with title {string}")
	public void it_should_navigate_to_applications_stack_page_with_title(String string) {
	    sp.getTitleAssesement();
	}
	
	@When("user enters the code in Applications page")
	public void user_enters_the_code_in_applications_page() throws InterruptedException {
	    sp.entertextdata();
	}

	@When("click on run button in Applications page")
	public void click_on_run_button_in_applications_page() {
	    sp.clickOnrundata();
	}


	@Then("user is navigated to home page from stack page {string}")
	public void user_is_navigated_to_home_page_from_stack_page(String string) {
	    sp.goHomePage();
	}

}
