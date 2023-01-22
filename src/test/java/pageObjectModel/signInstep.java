package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class signInstep {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\livya\\eclipse-workspace_2022\\Drivers\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	
	WebDriver driver;
	By signlink= By.xpath("//a[text()='Sign in']");
	By userName=By.xpath("//input[@name='username']");
	By pwd=By.cssSelector("input[name='password']");
	By login=By.cssSelector("input[type='submit']");
	By response=By.xpath("//div[contains(text(),'You are logged in')]");
		
	public signInstep(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clikOnsignInlink() {
		driver.findElement(signlink).click();
	}
		
	
	public void enterUserName(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	public void response() {
		driver.findElement(By.xpath("//div[contains(text(),'You are logged in')]")).equals("You are logged in");
	}
}
