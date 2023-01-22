package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	
	WebDriver driver;
	
	By getStarted=By.xpath("//button[contains(text(),'Get Started')]");
	By dropdownmenu=By.xpath("//a[contains(text(),'Data Structures')]");
	By dropdownselect=By.xpath("//div[@class='dropdown-menu show']/a[5]");
	By loginalert=By.xpath("//div[contains(text(),'You are not logged in')]");
	By getstartedbtn=By.xpath("//body/div[3]/div[3]/div[1]/div[1]/a[1]");
	By register=By.xpath("//a[contains(text(),'Register')]");
	
	public homePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnGetStarted() {
		
		 driver.findElement(getStarted).click();
		}
	
	public void clickdropdown() {
		
		 driver.findElement(dropdownmenu).click();
		}
	
	public void selectdropdown() {
		
		 driver.findElement(dropdownselect).click();
		}
	
	public void loginalert() {
		
		driver.findElement(loginalert).equals("You are not logged in");
		}
	
	public void clickOngetStarted2() {
		
		 driver.findElement(getstartedbtn).click();
		}
	
public void loginalert2() {
		
		driver.findElement(loginalert).equals("You are not logged in");
		}
	
public void register() {
	
	 driver.findElement(register).click();
	}

public void pagetitle() {
	
	 driver.getTitle().equals("NumpyNinja");
	 
	}
	

}
