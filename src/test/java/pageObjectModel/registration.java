package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registration {
	
	WebDriver driver;
	
	By getstarted=By.cssSelector("button[class='btn']");
	By registerlink=By.xpath("//a[text()=' Register ']");
	By userName=By.id("id_username");
	By Password=By.name("password1");	
	By confirmPassword=By.name("password2");
	By register=By.xpath("//input[@value='Register']");
	By signout=By.xpath("//a[contains(text(),'Sign out')]");
	By confirmsignout=By.xpath("//div[@class='alert alert-primary']");
	
	public registration(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getstarted() {
		driver.findElement(getstarted).click();
	}
	
	public void clickregisterlink() {
		driver.findElement(registerlink).click();
	}
	
	public void enterusername(String username) {
		driver.findElement(userName).sendKeys(username);
	
	}
	
	public void enterpassword(String password) {
		
	driver.findElement(Password).sendKeys(password);
	}
	
	public void confirmpassword(String confirm) {
		
		driver.findElement(confirmPassword).sendKeys(confirm);
		}
	
	public void clickOnRegister() {
		
		driver.findElement(register).click();
		}
	
	
	
	public void clickOnSignOut() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(signout).click();
		}
	
	public void response() {
		driver.findElement(confirmsignout).equals("You are logged in");
	}

	
}
