package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.array;

public class ninjaArray extends BaseClass {
	
	@Given("The user is in Ninja home page to navigate to Array Page {string}")
	public void the_user_is_in_ninja_home_page_to_navigate_to_array_page(String url) {
		ap=new array(driver);
	   	driver.get(url);
	}

	@Then("click on Get started button under array")
	public void click_on_get_started_button_under_array() {
		ap.CickongetStartedarray();
	}

	@Then("It should navigate to corresponding Array page with title {string}")
	public void it_should_navigate_to_corresponding_array_page_with_title(String string) {
	    ap.getTitlearray();
	}

	@When("user click on Arrays in Phython link")
	public void user_click_on_arrays_in_phython_link() {
	    ap.CickonArraysinPython();
	}

	@When("It should navigate to corresponding Arrays in Python page with title {string}")
	public void it_should_navigate_to_corresponding_arrays_in_python_page_with_title(String string) {
	    ap.getTitleArraysinPython();
	}

	@Then("user click on Try here in Arrays in Python page")
	public void user_click_on_try_here_in_arrays_in_python_page() {
	    ap.Cickonlinktryhere();
	}

	@Then("It should navigate to corresponding Arrays in Python Assessment page with title {string}")
	public void it_should_navigate_to_corresponding_arrays_in_python_assessment_page_with_title(String string) {
	    ap.getTitleAssesement();
	}

	@When("user enter the Python code in Arrays in Python page")
	public void user_enter_the_python_code_in_arrays_in_python_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		   ap.entertextdata(name);
	}

	@When("click on run button in Arrays in Python Assessment page")
	public void click_on_run_button_in_arrays_in_python_assessment_page() throws InterruptedException {
	   ap.clickOnrundata();
	   Thread.sleep(1500);
	}

	@Then("User navigates back to Arrays in Python page")
	public void user_navigates_back_to_arrays_in_python_page() {
	   ap.clickOnback();
	}
	
	@When("User click on Arrays using list")
	public void user_click_on_arrays_using_list() {
	    ap.Cickonarraylist();
	}

	@When("It should navigate to corresponding Arrays Using List page with title {string}")
	public void it_should_navigate_to_corresponding_arrays_using_list_page_with_title(String string) {
	    ap.getTitlearraylist();
	}

	@Then("user click on Try here in Arrays Using List page")
	public void user_click_on_try_here_in_arrays_using_list_page() {
	    ap.Cickonlinktryhere();
	}

	@Then("It should navigate to corresponding Arrays Using List Assessment page with title {string}")
	public void it_should_navigate_to_corresponding_arrays_using_list_assessment_page_with_title(String string) {
	   ap.getTitleAssesement();
	}

	@When("user enter the Python code in Arrays Using List page")
	public void user_enter_the_python_code_in_arrays_using_list_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		   ap.entertextdata(name);
	}

	@When("click on run button in Arrays Using List Assessment page")
	public void click_on_run_button_in_arrays_using_list_assessment_page() throws InterruptedException {
	   ap.clickOnrundata();
	   Thread.sleep(1500);
	}

	@Then("User navigate back to Arrays Using List page")
	public void user_navigate_back_to_arrays_using_list_page() {
	   ap.clickOnback();
	}

	@When("User click on Basic Operations in list")
	public void user_click_on_basic_operations_in_list() {
	    ap.CickonarraybasicOperations();
	}

	@When("It should navigate to corresponding Operations in list page with title {string}")
	public void it_should_navigate_to_corresponding_operations_in_list_page_with_title(String string) {
	    ap.getTitlebasicOperations();
	}

	@Then("user click on Try here in Operations in list page")
	public void user_click_on_try_here_in_operations_in_list_page() {
	    ap.Cickonlinktryhere();
	}

	@Then("It should navigate to corresponding Operations in list Assessment page with title {string}")
	public void it_should_navigate_to_corresponding_operations_in_list_assessment_page_with_title(String string) {
	    ap.getTitleAssesement();
	}

	@When("user enter the Python code in Operations in list page")
	public void user_enter_the_python_code_in_operations_in_list_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		   ap.entertextdata(name);
	}

	@When("click on run button in Operations in list Assessment page")
	public void click_on_run_button_in_operations_in_list_assessment_page() throws InterruptedException {
	    ap.clickOnrundata();
	    Thread.sleep(1500);
	}
	

	@Then("User navigate back to Operations in list page")
	public void user_navigate_back_to_operations_in_list_page() {
	    ap.clickOnback();
	}

	@When("User click on Applications of Array")
	public void user_click_on_applications_of_array() {
	    ap.Cickonapplicationsarray();
	}

	@When("It should navigate to corresponding Applications of Array page with title {string}")
	public void it_should_navigate_to_corresponding_applications_of_array_page_with_title(String string) {
	    ap.getTitleApplications();
	}

	@Then("user click on Try here in Applications of Array page")
	public void user_click_on_try_here_in_applications_of_array_page() {
	    ap.Cickonlinktryhere();
	}

	@Then("It should navigate to corresponding Applications of Array Assessment page with title {string}")
	public void it_should_navigate_to_corresponding_applications_of_array_assessment_page_with_title(String string) {
	    ap.getTitleAssesement();
	}

	@When("user enter the Python code in Applications of Array page")
	public void user_enter_the_python_code_in_applications_of_array_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		   ap.entertextdata(name);
	}

	@When("click on run button in Applications of Array page")
	public void click_on_run_button_in_applications_of_array_page() throws InterruptedException {
	    ap.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back to Applications of Array page")
	public void user_navigate_back_to_applications_of_array_page() {
	    ap.clickOnback();
	}

	@When("user click on Practice Questions")
	public void user_click_on_practice_questions() {
	    ap.CickonarrayPractice();
	}

	@When("It should navigate to corresponding Practice Questions page with title {string}")
	public void it_should_navigate_to_corresponding_practice_questions_page_with_title(String string) {
	    ap.getTitlePractice();
	}

	@When("user click on Search the array link")
	public void user_click_on_search_the_array_link() {
	    ap.Cickonsearcharray();
	}

	@When("It should navigate to corresponding Search the array page with title {string}")
	public void it_should_navigate_to_corresponding_search_the_array_page_with_title(String string) {
	    ap.getTitleAssesement();
	}

	@When("user enter the Python code in Search the array page")
	public void user_enter_the_python_code_in_search_the_array_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ap.practicetextdata(name);
	}
	
	/*@When("user enter the Python code in Search the array page print\\({string})")
	public void user_enter_the_python_code_in_search_the_array_page_print(String PythonCode) throws InterruptedException {
	    ap.practicetextdata(PythonCode);
	}
	*/

	@When("click on run button in Search the array page")
	public void click_on_run_button_in_search_the_array_page() throws InterruptedException {
	   ap.clickOnrundata();
	   Thread.sleep(1500);
	}

	@Then("User navigate back to Search the array page")
	public void user_navigate_back_to_search_the_array_page() {
	    ap.clickOnback();
	}

	@When("user clicks on Max Consecutive Ones link")
	public void user_clicks_on_max_consecutive_ones_link() {
	   ap.Cickonarraymax();
	}

	@When("It should navigate to corresponding Max Consecutive Ones page with title {string}")
	public void it_should_navigate_to_corresponding_max_consecutive_ones_page_with_title(String string) {
		ap.getTitleAssesement();
	}

	@When("user clear the text and enter the Python code in Max Consecutive Ones page")
	public void user_clear_the_text_and_enter_the_python_code_in_max_consecutive_ones_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ap.practicetextdata(name);
	}

	@When("click on run button in Max Consecutive Ones Assessment page")
	public void click_on_run_button_in_max_consecutive_ones_assessment_page() throws InterruptedException {
	    ap.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("User navigate back to Max Consecutive Ones")
	public void user_navigate_back_to_max_consecutive_ones() {
	    ap.clickOnback();
	}

	@When("user click on Find Numbers with Even Number of Digits")
	public void user_click_on_find_numbers_with_even_number_of_digits() {
	    ap.Cickonarrayfindnumbers();
	}

	@When("It should navigate to corresponding Even Number page with title {string}")
	public void it_should_navigate_to_corresponding_even_number_page_with_title(String string) {
	   ap.getTitleAssesement();
	}

	@When("user clear the text and enter the Python code in Even Number Assessment page")
	public void user_clear_the_text_and_enter_the_python_code_in_even_number_assessment_page() throws InterruptedException {

		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		ap.practicetextdata(name);
	}

	@When("click on run button in Even Number page")
	public void click_on_run_button_in_even_number_page() throws InterruptedException {
	   ap.clickOnrundata();
	   Thread.sleep(1500);
	}

	@Then("User navigate back to Even Number page")
	public void user_navigate_back_to_even_number_page() {
	    ap.clickOnback();
	}

	@When("user click on Find Numbers with Squares of  a Sorted Array")
	public void user_click_on_find_numbers_with_squares_of_a_sorted_array() {
	    ap.Cickonarraysquares();
	}

	@When("It should navigate to corresponding Sorted Array page with title {string}")
	public void it_should_navigate_to_corresponding_sorted_array_page_with_title(String string) {
	   ap.getTitleAssesement();
	}

	@When("user clear the text and enter the Python code in Sorted Array Assessment page")
	public void user_clear_the_text_and_enter_the_python_code_in_sorted_array_assessment_page() throws InterruptedException {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		   ap.practicetextdata(name);
	}

	@When("click on run button in Sorted Array page")
	public void click_on_run_button_in_sorted_array_page() throws InterruptedException {
	    ap.clickOnrundata();
	    Thread.sleep(1500);
	}

	@Then("user is navigated to home page from Sorted Array page {string}")
	public void user_is_navigated_to_home_page_from_sorted_array_page(String string) {
		  ap.goHomePage();
	}
	
	
	

}
