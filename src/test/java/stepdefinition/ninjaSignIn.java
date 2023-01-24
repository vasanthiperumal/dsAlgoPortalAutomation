package stepdefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.signInstep;


public class ninjaSignIn extends BaseClass {
	
	WebDriver driver1;
	signInstep lk = new signInstep(driver);
	
	@Given("user navigates to the dsportalapp Login page {string}")
	public void user_navigates_to_the_dsportalapp_Login_page(String url) {
		driver.get("https://dsportalapp.herokuapp.com/login");
			
	}
	@When("user click on SignIn link")
	public void user_click_on_SignIn_link() {
		
		lk.clikOnsignInlink();
		
	}
	
	@When("^user enter the (.*)and(.*)$")
	public void the_user_enter_the_user_name_and_password(String username,String password) throws InterruptedException {
		Thread.sleep(200);
		lk.enterUserName(username);
		lk.enterPassword(password);
	
	}
	
	@When("user clicks on the Login button")
	public void user_clicks_on_the_Login_button() {
		lk.clickOnLogin();
	}
	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		lk.response();
	}

}
