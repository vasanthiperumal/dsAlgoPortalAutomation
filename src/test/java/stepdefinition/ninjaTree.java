package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.tree;

public class ninjaTree extends BaseClass {
	
	
	@Given("The user is in Ninja home page to navigate to Tree Page {string}")
	public void the_user_is_in_ninja_home_page_to_navigate_to_tree_page(String url) {
		tp=new tree(driver);
	   	driver.get(url);
	}

	@When("user click on Get Started button under Tree section")
	public void user_click_on_get_started_button_under_tree_section() {
	    tp.CickongetStartedTree();
	}

	@When("It should navigate to Tree page with title {string}")
	public void it_should_navigate_to_tree_page_with_title(String string) {
		tp.getTitletree();
	   
	}

	@When("user click on Overview of Trees")
	public void user_click_on_overview_of_trees() {
	    tp.CickonOverviewofTrees();
	}

	@When("It should navigate to Overview of Trees page with title {string}")
	public void it_should_navigate_to_overview_of_trees_page_with_title(String string) {
	    tp.getTitleOverviewofTrees();
	}

	@When("user click on Try here in Overview of Trees page")
	public void user_click_on_try_here_in_overview_of_trees_page() {
	   tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Overview of Trees page")
	public void user_enter_the_python_code_in_overview_of_trees_page() throws InterruptedException {
	   tp.entertextdata();
	}

	@When("click on run button in Overview of Trees page")
	public void click_on_run_button_in_overview_of_trees_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Overview of Trees")
	public void user_navigate_back_to_overview_of_trees() {
	    tp.clickOnback();
	}

	@When("user click on Terminologies link")
	public void user_click_on_terminologies_link() {
		tp.CickonTerminologies();
	}

	@Then("It should navigate to Terminologies page with title {string}")
	public void it_should_navigate_to_terminologies_page_with_title(String string) {
	    tp.getTitleTerminologies();
	}

	@When("user click on Try here in Terminologies page")
	public void user_click_on_try_here_in_terminologies_page() {
		tp.Cickonlinktryhere();
	    
	}

	@When("user enter the Python code in Terminologies page")
	public void user_enter_the_python_code_in_terminologies_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Terminologies page")
	public void click_on_run_button_in_terminologies_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Terminologies page")
	public void user_navigate_back_to_terminologies_page() {
	    tp.clickOnback();
	}

	@When("user click on Types of Trees link")
	public void user_click_on_types_of_trees_link() {
	    tp.CickonTypesofTrees();
	}

	@Then("It should navigate to Types of Trees page with title {string}")
	public void it_should_navigate_to_types_of_trees_page_with_title(String string) {
	    tp.getTitleTypesofTrees();
	}

	@When("user click on Try here in Types of Trees page")
	public void user_click_on_try_here_in_types_of_trees_page() {
	    tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Types of Trees page")
	public void user_enter_the_python_code_in_types_of_trees_page() throws InterruptedException {
	   tp.entertextdata();
	}

	@When("click on run button in Types of Trees page")
	public void click_on_run_button_in_types_of_trees_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Types of Trees page")
	public void user_navigate_back_to_types_of_trees_page() {
	    tp.clickOnback();
	}

	@When("user click on Tree Traversals link")
	public void user_click_on_tree_traversals_link() {
	    tp.CickonTypesofTrees();
	}

	@Then("It should navigate to Tree Traversals page with title {string}")
	public void it_should_navigate_to_tree_traversals_page_with_title(String string) {
	    tp.getTitleTypesofTrees();
	}

	@When("user click on Try here in Tree Traversals page")
	public void user_click_on_try_here_in_tree_traversals_page() {
		tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Tree Traversals page")
	public void user_enter_the_python_code_in_tree_traversals_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Tree Traversals page")
	public void click_on_run_button_in_tree_traversals_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Tree Traversals page")
	public void user_navigate_back_to_tree_traversals_page() {
	    tp.clickOnback();
	}

	@When("user click on Traversals-Illustration link")
	public void user_click_on_traversals_illustration_link() {
	    tp.CickonTraversalsIllustration();
	}

	@Then("It should navigate to Traversals-Illustration page with title {string}")
	public void it_should_navigate_to_traversals_illustration_page_with_title(String string) {
	    tp.getTitleTraversalsIllustration();
	}

	@When("user click on Try here in Traversals-Illustration page")
	public void user_click_on_try_here_in_traversals_illustration_page() {
	   tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Traversals-Illustration page")
	public void user_enter_the_python_code_in_traversals_illustration_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Traversals-Illustration page")
	public void click_on_run_button_in_traversals_illustration_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Traversals-Illustration page")
	public void user_navigate_back_to_traversals_illustration_page() {
	   tp.clickOnback();
	}

	@When("user click on Binary Trees link")
	public void user_click_on_binary_trees_link() {
	    tp.CickonBinaryTrees();
	}

	@Then("It should navigate to Binary Trees page with title {string}")
	public void it_should_navigate_to_binary_trees_page_with_title(String string) {
	   tp.getTitleBinaryTrees();
	}

	@When("user click on Try here in Binary Trees page")
	public void user_click_on_try_here_in_binary_trees_page() {
	    tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Binary Trees page")
	public void user_enter_the_python_code_in_binary_trees_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Binary Trees page")
	public void click_on_run_button_in_binary_trees_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Binary Trees page")
	public void user_navigate_back_to_binary_trees_page() {
	    tp.clickOnback();
	}

	@When("user click on Types of Binary Trees link")
	public void user_click_on_types_of_binary_trees_link() {
	    tp.CickonTypesBinaryTrees();
	}

	@Then("It should navigate to Types of Binary Trees page with title {string}")
	public void it_should_navigate_to_types_of_binary_trees_page_with_title(String string) {
	    tp.getTitleTypesBinaryTrees();
	}

	@When("user click on Try here in Types of Binary Trees page")
	public void user_click_on_try_here_in_types_of_binary_trees_page() {
	   tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Types of Binary Trees page")
	public void user_enter_the_python_code_in_types_of_binary_trees_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Types of Binary Trees page")
	public void click_on_run_button_in_types_of_binary_trees_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Types of Binary Trees page")
	public void user_navigate_back_to_types_of_binary_trees_page() {
	    tp.clickOnback();
	}

	@When("user click on Implementation in Python link")
	public void user_click_on_implementation_in_python_link() {
	    tp.CickonImplementationPython();
	}

	@Then("It should navigate to Implementation in Python page with title {string}")
	public void it_should_navigate_to_implementation_in_python_page_with_title(String string) {
	    tp.getTitleImplementationPython();
	}

	@When("user click on Try here in Implementation in Python page")
	public void user_click_on_try_here_in_implementation_in_python_page() {
	    tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Implementation in Python page")
	public void user_enter_the_python_code_in_implementation_in_python_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Implementation in Python page")
	public void click_on_run_button_in_implementation_in_python_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Implementation in Python page")
	public void user_navigate_back_to_implementation_in_python_page() {
	    tp.clickOnback();
	}

	@When("user click on Binary Tree Traversals link")
	public void user_click_on_binary_tree_traversals_link() {
	    tp.CickonBinaryTreeTraversals();
	}

	@Then("It should navigate to Binary Tree Traversals page with title {string}")
	public void it_should_navigate_to_binary_tree_traversals_page_with_title(String string) {
	    tp.getTitleBinaryTreeTraversals();
	}

	@When("user click on Try here in Binary Tree Traversals page")
	public void user_click_on_try_here_in_binary_tree_traversals_page() {
	   tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Binary Tree Traversals page")
	public void user_enter_the_python_code_in_binary_tree_traversals_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Binary Tree Traversals page")
	public void click_on_run_button_in_binary_tree_traversals_page() {
	   tp.clickOnrundata();
	}

	@Then("User navigate back to Binary Tree Traversals page")
	public void user_navigate_back_to_binary_tree_traversals_page() {
	    tp.clickOnback();
	}

	@When("user click on Implementation of Binary Trees link")
	public void user_click_on_implementation_of_binary_trees_link() {
	    tp.CickonImplementationofBinaryTrees();
	}

	@Then("It should navigate to Implementation of Binary Trees page with title {string}")
	public void it_should_navigate_to_implementation_of_binary_trees_page_with_title(String string) {
	    tp.getTitleImplementationofBinaryTrees();
	}

	@When("user click on Try here in Implementation of Binary Trees page")
	public void user_click_on_try_here_in_implementation_of_binary_trees_page() {
	    tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Implementation of Binary Trees page")
	public void user_enter_the_python_code_in_implementation_of_binary_trees_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Implementation of Binary Trees page")
	public void click_on_run_button_in_implementation_of_binary_trees_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Implementation of Binary Trees page")
	public void user_navigate_back_to_implementation_of_binary_trees_page() {
	    tp.clickOnback();
	}

	@When("user click on Applications of Binary trees link")
	public void user_click_on_applications_of_binary_trees_link() {
	    tp.CickonApplicationsofBinarytrees();
	}

	@Then("It should navigate to Applications of Binary trees page with title {string}")
	public void it_should_navigate_to_applications_of_binary_trees_page_with_title(String string) {
	    tp.getTitleApplicationsofBinarytrees();
	}

	@When("user click on Try here in Applications of Binary trees page")
	public void user_click_on_try_here_in_applications_of_binary_trees_page() {
	    tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Applications of Binary trees page")
	public void user_enter_the_python_code_in_applications_of_binary_trees_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Applications of Binary trees page")
	public void click_on_run_button_in_applications_of_binary_trees_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Applications of Binary trees page")
	public void user_navigate_back_to_applications_of_binary_trees_page() {
	   tp.clickOnback();
	}

	@When("user click on Binary Search Trees link")
	public void user_click_on_binary_search_trees_link() {
	    tp.CickonBinarySearchTrees();
	}

	@Then("It should navigate to Binary Search Trees page with title {string}")
	public void it_should_navigate_to_binary_search_trees_page_with_title(String string) {
	    tp.getTitleBinarySearchTrees();
	}

	@When("user click on Try here in Binary Search Trees page")
	public void user_click_on_try_here_in_binary_search_trees_page() {
	    tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Binary Search Trees page")
	public void user_enter_the_python_code_in_binary_search_trees_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Binary Search Trees page")
	public void click_on_run_button_in_binary_search_trees_page() {
	    tp.clickOnrundata();
	}

	@Then("User navigate back to Binary Search Trees page")
	public void user_navigate_back_to_binary_search_trees_page() {
	    tp.clickOnback();
	}

	@When("user click on Implementation Of BST link")
	public void user_click_on_implementation_of_bst_link() {
		tp.CickonImplementationOfBST();
	}

	@Then("It should navigate to Implementation Of BST page with title {string}")
	public void it_should_navigate_to_implementation_of_bst_page_with_title(String string) {
		tp.getTitleImplementationOfBST();
	}

	@When("user click on Try here in Implementation Of BST page")
	public void user_click_on_try_here_in_implementation_of_bst_page() {
	    tp.Cickonlinktryhere();
	}

	@When("user enter the Python code in Implementation Of BST page")
	public void user_enter_the_python_code_in_implementation_of_bst_page() throws InterruptedException {
	    tp.entertextdata();
	}

	@When("click on run button in Implementation Of BST page")
	public void click_on_run_button_in_implementation_of_bst_page() {
	    tp.clickOnrundata();
	}

	@Then("user is navigated to home page from Implementation Of BST {string}")
	public void user_is_navigated_to_home_page_from_implementation_of_bst(String string) {
	   tp.goHomePage();
	}
	
	

}
