package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class graphPage {
	
	WebDriver driver;
	
	By getStarted=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]//a");
	By graphlink =By.xpath("//body/div[2]/ul[2]/a[1]");
	By tryhere=By.xpath("//a[contains(text(),'Try here>>>')]");
	By entertext=By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]");
	By runbutton=By.xpath("//button[contains(text(),'Run')]");
	By graphrepresentation=By.xpath("//a[contains(text(),'Graph Representations')]");
	By HomePage=By.xpath("//a[contains(text(),'NumpyNinja')]");
	
	public graphPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnGetStarted()  {
			driver.findElement(getStarted).click();
			}
	
public void getTitlegraph() {
		
		driver.getTitle().equals("Graph");
	}
	
	public void clickongraphlink() {
		driver.findElement(graphlink).click();
	}
	
	public void clickontryhere() {
		driver.findElement(tryhere).click();
	}
	
	public void getTitleAssesement() {
		
		driver.getTitle().equals("Assessment");
	}
	
	public void clickonentertext() {
		driver.findElement(entertext).sendKeys("print \"Graphpage Introduction\"");
	}
	
	public void clickonrunbutton() {
		driver.findElement(runbutton).click();
	}
	
	public void clickongraphrepresentation() {
		driver.findElement(graphrepresentation).click();
	}
	
public void getTitlegraphrep() {
		
		driver.getTitle().equals("Graph Representations");
	}

public void clickOnback() {
	
	driver.navigate().back();
	}

public void goHomePage() {
	
	driver.navigate().back();
	driver.findElement(HomePage).click();
}

	
}
