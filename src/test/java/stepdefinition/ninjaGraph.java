package stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.graphPage;

public class ninjaGraph extends BaseClass {
	
	private static final Logger logger = LogManager.getLogger(ninjaGraph.class);
	
	@Given("The user is in Ninja home page to navigate to graph Page {string}")
	public void the_user_is_in_ninja_home_page_to_navigate_to_graph_page(String url) {
		gp=new graphPage(driver);
	   	driver.get(url);
	}

	@When("user click on Get Started button on Graph")
	public void user_click_on_get_started_button_on_graph() {
	    gp.clickOnGetStarted();
	}

	@Then("It should navigate to Graph page with title {string}")
	public void it_should_navigate_to_graph_page_with_title(String string) {
	   gp.getTitlegraph();
	}

	@When("user click on Graph link")
	public void user_click_on_graph_link() {
	    gp.clickongraphlink();
	}

	@When("user click on Try here")
	public void user_click_on_try_here() {
	  gp.clickontryhere();
	}

	@Then("It should navigate to Graph Assessement page with title {string}")
	public void it_should_navigate_to_graph_assessement_page_with_title(String string) {
	    gp.getTitleAssesement();
	}

	@When("user enter the Python code in graph page")
	public void user_enter_the_python_code_in_graph_page() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
	   gp.clickonentertext(name);
	}

	@When("click on run button in graph page")
	public void click_on_run_button_in_graph_page() throws InterruptedException {
	    gp.clickonrunbutton();
	}

	@Then("User navigate back from  graph page")
	public void user_navigate_back_from_graph_page() {
	  gp.clickOnback();
	}

	@When("user click on Graph Representations link")
	public void user_click_on_graph_representations_link() {
	   gp.clickongraphrepresentation();
	}

	@Then("It should navigate to Graph Representations page with title {string}")
	public void it_should_navigate_to_graph_representations_page_with_title(String string) {
	    gp.getTitlegraphrep();
	}

	@When("user click on Try here in Graph Representations page")
	public void user_click_on_try_here_in_graph_representations_page() {
	    gp.clickontryhere();
	}

	@When("user enter the Python code in Graph Representations page")
	public void user_enter_the_python_code_in_graph_representations_page() {
		
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		logger.info("Method name: "+ name);
	    gp.clickonentertext(name);
	}

	@When("click on run button in Graph Representations page")
	public void click_on_run_button_in_graph_representations_page() throws InterruptedException {
	    gp.clickonrunbutton();
	}

	@Then("user is navigated to home page from Graph Representations page {string}")
	public void user_is_navigated_to_home_page_from_graph_representations_page(String string) {
	    gp.goHomePage();
	}

}
