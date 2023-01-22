package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.queuePage;

public class ninjaQueue extends BaseClass {
	
	@Given("The user is in Ninja home page Queue {string}")
	public void the_user_is_in_ninja_home_page_Queue(String url) {
		qp=new queuePage(driver);
	   	driver.get(url);
	}
	
	@When("user clicks on Get Started button under Queue")
	public void user_clicks_on_get_started_button_under_queue() {
	  qp.CickongetStartedQueue();
	}

	@When("It should navigates to corresponding page with title Queue {string}")
	public void it_should_navigates_to_corresponding_page_with_title(String string) {
	    qp.getTitleQueue();
	}

	@When("user clicks on Implementation of Queue in Python")
	public void user_clicks_on_implementation_of_queue_in_python() {
	   qp.CickonImplementationofQueue();
	}

	@When("user clicks on Try here")
	public void user_clicks_on_try_here() {
	    qp.Cickonlinktryhere();
	}
	
	@When("It should navigate to corresponding page with title Queue {string}")
	public void it_should_navigate_to_corresponding_page_with_title_queue(String string) {
	    qp.getTitleAssesement();
	}

	@When("user enters the code in Implementation of Queue in Python Assessment page")
	public void user_enters_the_code_in_implementation_of_queue_in_python_assessment_page() throws InterruptedException {
	    qp.entertextdata();
	}

	@When("clicks on run button")
	public void clicks_on_run_button() {
	   qp.clickOnrundata();
	}

	@Then("User navigates back")
	public void user_navigates_back() {
	    qp.clickOnback();
	}

	@When("user clicks on Implementation using collections.deque")
	public void user_clicks_on_implementation_using_collections_deque() {
	    qp.CickonImplementationofCollections();
	}
	
	@When("It should navigate to corresponding page with title Queue deque {string}")
	public void it_should_navigate_to_corresponding_page_with_title_queue_deque(String string) {
	    qp.getTitleImpleCollecdeque();
	}

	@When("user clicks on Try here link")
	public void user_clicks_on_try_here_link() {
	    qp.Cickonlinktryhere();
	}
	
	@When("It should navigate to corresponding page with title Queue deque\"Assessment\"")
	public void it_should_navigate_to_corresponding_page_with_title_queue_deque_assessment() {
	    qp.getTitleAssesement();
	}

	@When("user enters the code in Implementation using collections.deque Assessment page")
	public void user_enters_the_code_in_implementation_using_collections_deque_assessment_page() {
	    qp.getTitleAssesement();
	}

	@When("user click on Implementation using array")
	public void user_click_on_implementation_using_array() {
	    qp.CickonImplementationArrays();
	}
	
	@When("It should navigates to corresponding page with title array {string}")
	public void it_should_navigates_to_corresponding_page_with_title_array(String string) {
	    qp.getTitleImplearray();
	}

	@When("user enters the code in Implementation using array Assessment page")
	public void user_enters_the_code_in_implementation_using_array_assessment_page() throws InterruptedException {
	    qp.entertextdata();
	}
	
	@When("It should navigate to corresponding page with title array {string}")
	public void it_should_navigate_to_corresponding_page_with_title_array(String string) {
	    qp.getTitleAssesement();
	}

	@When("user clicks on Queue Operations link")
	public void user_clicks_on_queue_operations_link() {
	    qp.CickonQueueOperations();
	}
	
	@When("It should navigate to corresponding page with title operations {string}")
	public void it_should_navigate_to_corresponding_page_with_title_operations(String string) {
	    qp.getTitleOperations();
	}

	@When("user enters the code in Queue Operations Assessment page")
	public void user_enters_the_code_in_queue_operations_assessment_page() throws InterruptedException {
		 qp.entertextdata();
	}
	
	@When("It should navigates to corresponding page with title operations {string}")
	public void it_should_navigates_to_corresponding_page_with_title_operations(String string) {
	   qp.getTitleAssesement();
	}

	@Then("User navigates back to home page {string}")
	public void user_navigates_back_to_home_page(String string) {
	    qp.goHomePage();
	}
	


}
