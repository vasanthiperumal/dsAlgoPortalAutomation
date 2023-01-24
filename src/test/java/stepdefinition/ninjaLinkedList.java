package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.linkedList;

public class ninjaLinkedList extends BaseClass {
	
	
	@Given("The user is in Ninja home page {string}")
	public void the_user_is_in_ninja_home_page(String url) {
		ll=new linkedList(driver);
	   	driver.get(url);
	}

	@When("user click on Get Started button on Linklist")
	public void user_click_on_get_started_button_on_linklist() {
	    ll.CickonGetStarted();
	}

	@Then("It should navigate to appropriate page with title {string}")
	public void it_should_navigate_to_appropriate_page_with_title(String string) throws InterruptedException {
	    ll.getTitleLinkedList();
	    Thread.sleep(200);
	}

	@When("user click on Introduction link")
	public void user_click_on_introduction_link() {
	    ll.Cickonintroduction();
	}
	
	@Then("It should navigate to appropriate page with title Introduction {string}")
	public void it_should_navigate_to_appropriate_page_with_title_Introduction(String string) throws InterruptedException {
	    ll.getTitleIntro();
	    Thread.sleep(200);
	}

	@When("user click on Try here button in Introduction page")
	public void user_click_on_try_here_button_in_introduction_page() {
	    ll.Cickonlinktryhere();
	}
	
	@Then("It should navigate to appropriate page with title Assessment {string}")
	public void it_should_navigate_to_appropriate_page_with_title_assessment(String string) {
	    ll.getTitleAssesement();
	}

	@When("user enter the code in linklist assesement page")
	public void user_enter_the_code_in_linklist_assesement_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		   ll.entertextdata(name);
	}

	@When("click on run button in linklist assesement page")
	public void click_on_run_button_in_linklist_assesement_page() throws InterruptedException {
	    ll.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back from linklist assesement page")
	public void user_navigate_back_from_linklist_assesement_page() {
	    ll.clickOnback();
	}

	@When("user click on Creating Linked List")
	public void user_click_on_creating_linked_list() {
	    ll.CickoncreateLinked();
	}

	@When("user click on Try here button in Linked List page")
	public void user_click_on_try_here_button_in_linked_list_page() {
	   ll.Cickonlinktryhere();
	}

	@When("user enter the code in Creating Linked List page")
	public void user_enter_the_code_in_creating_linked_list_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ll.entertextdata(name);
	}

	@When("click on run button in Creating Linked List page")
	public void click_on_run_button_in_creating_linked_list_page() throws InterruptedException {
	    ll.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back from Creating Linked List page")
	public void user_navigate_back_from_creating_linked_list_page() {
	    ll.clickOnback();
	}

	@When("user click on Types of Linked List")
	public void user_click_on_types_of_linked_list() {
	    ll.CickontypesOfLinked();
	}

	@When("user click on Try here button in Types of Linked List")
	public void user_click_on_try_here_button_in_types_of_linked_list() {
		ll.Cickonlinktryhere();
	}

	@When("user enter code in Types of Linked List")
	public void user_enter_code_in_types_of_linked_list() throws InterruptedException {
	    String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ll.entertextdata(name);
	}

	@When("click on run button in Types of Linked List")
	public void click_on_run_button_in_types_of_linked_list() throws InterruptedException {
	    ll.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back from Types of Linked List")
	public void user_navigate_back_from_types_of_linked_list() {
	    ll.clickOnback();
	}

	@When("user click on Implement Linked List in Python")
	public void user_click_on_implement_linked_list_in_python() {
	    ll.CickonImplementedlist();
	}

	@When("user click on Try here button in Implement Linked List")
	public void user_click_on_try_here_button_in_implement_linked_list() {
		ll.Cickonlinktryhere();
	}

	@When("user enter code in Implement Linked List page")
	public void user_enter_code_in_implement_linked_list_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ll.entertextdata(name);
	}

	@When("click on run button in Implement Linked List page")
	public void click_on_run_button_in_implement_linked_list_page() throws InterruptedException {
	    ll.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back from Implement Linked List page")
	public void user_navigate_back_from_implement_linked_list_page() {
	    ll.clickOnback();
	}

	@When("user click on Traversal link")
	public void user_click_on_traversal_link() {
	    ll.Cickontraversal();
	}

	@When("user click on Try here button in Traversal link page")
	public void user_click_on_try_here_button_in_traversal_link_page() {
	    ll.Cickonlinktryhere();
	}

	@When("user enter the code in Traversal link page")
	public void user_enter_the_code_in_traversal_link_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ll.entertextdata(name);
	}

	@When("click on run button in Traversal link page")
	public void click_on_run_button_in_traversal_link_page() throws InterruptedException {
	    ll.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back from Traversal link page")
	public void user_navigate_back_from_traversal_link_page() {
	    ll.clickOnback();
	}

	@When("user click on Insertion link")
	public void user_click_on_insertion_link() {
	    ll.Cickoninsertion();
	}

	@When("user click on Try here button in Insertion link page")
	public void user_click_on_try_here_button_in_insertion_link_page() {
	    ll.Cickonlinktryhere();
	}

	@When("user enter code in Insertion link page")
	public void user_enter_code_in_insertion_link_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ll.entertextdata(name);
	}

	@When("click on run button in Insertion link page")
	public void click_on_run_button_in_insertion_link_page() throws InterruptedException {
	    ll.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back from Insertion link page")
	public void user_navigate_back_from_insertion_link_page() {
	    ll.clickOnback();
	}

	@When("user click on Deletion link")
	public void user_click_on_deletion_link() {
	   ll.Cickondeletion();
	}

	@When("user click on Try here button in Deletion page")
	public void user_click_on_try_here_button_in_deletion_page() {
	    ll.Cickonlinktryhere();
	}

	@When("user enter the code in in Deletion page")
	public void user_enter_the_code_in_in_deletion_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ll.entertextdata(name);
	}

	@When("click on run button in Deletion page")
	public void click_on_run_button_in_deletion_page() throws InterruptedException {
	    ll.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back from Deletion page")
	public void user_navigate_back_from_deletion_page() {
	    ll.clickOnback();
	}

}
