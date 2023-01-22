package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.registration;

public class ninjaRegistration extends BaseClass {

	@Given("user navigates to the dsportalapp page url {string}")
	public void user_navigates_to_the_dsportalapp_page_url(String url) {
		nr=new registration(driver);
	   	driver.get(url);
	}
	
	@When("user clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
	   nr.getstarted();
	}
		
	@When("user clicks on {string} link")
	public void user_clicks_on_link(String string) {
		nr.clickregisterlink();
	}
	
	@Then("The user enter the (.*) ,(.*) and (.*)$")
	public void the_user_enter_the_user_name_password_and_confirm_password(String username,String password,String confirm) throws InterruptedException {
		
		Thread.sleep(500);
		nr.enterusername(username);
		nr.enterpassword(password);
		nr.confirmpassword(confirm);
	}
	
	@Then("user clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
		nr.clickOnRegister();
	}
	
	@When("user clicks on 'Sign Out link")
	public void user_clicks_on_sign_out_link() throws InterruptedException {
		nr.clickOnSignOut();
	}

	@Then("user will see a message {string} and user is signed out")
	public void user_will_see_a_message_and_user_is_signed_out(String string) throws InterruptedException {
		nr.response();
	}
}
