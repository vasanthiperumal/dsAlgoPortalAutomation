package pageObjectModel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class graphPage {
	
	WebDriver driver;
	
	By getStarted=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]//a");
	By graphlink =By.xpath("//body/div[2]/ul[2]/a[1]");
	By tryhere=By.xpath("//a[contains(text(),'Try here>>>')]");
	By entertext=By.xpath("//textarea[@tabindex='0']");
	By runbutton=By.xpath("//button[contains(text(),'Run')]");
	By graphrepresentation=By.xpath("//a[contains(text(),'Graph Representations')]");
	By HomePage=By.xpath("//a[contains(text(),'NumpyNinja')]");
	
	private static final Logger logger = LogManager.getLogger(graphPage.class);
	
	
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
	
	public void clickonentertext(String name) {
		String title = "Graphpage Introduction: " + name;
		String pythonCode = "print '"+title+"'";
		driver.findElement(entertext).sendKeys(pythonCode);
	}
	
	public void clickonrunbutton() throws InterruptedException {
		driver.findElement(runbutton).click();
		Thread.sleep(1500);
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
