package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dataStructure {
	
	WebDriver driver;
	
	By getStarted=By.xpath("//body/div[2]/div[1]/div[1]/div[1]/a[1]");
	//By datastructure=By.xpath("//body/div[2]/div[1]/div[1]/div[1]/a[1]");
	By timecomplex=By.xpath("//a[contains(text(),'Time Complexity')]");
	By tryheredata=By.xpath("//a[contains(text(),'Try here>>>')]");
	By entertext=By.xpath("//textarea[@tabindex='0']");
	By textdata=By.cssSelector("div.container:nth-child(2) div.code-area form:nth-child(1) div.input:nth-child(2) div.CodeMirror.cm-s-default:nth-child(2) > div.CodeMirror-scroll:nth-child(6)");
	By rundata=By.xpath("//button[contains(text(),'Run')]");
	
	public dataStructure(WebDriver driver) {
		this.driver=driver;
	}
	
	public void pagetitleds() {
		
		 driver.getTitle().equals("NumpyNinja");
		 
		}
	
	public void clickOnGetStarted() {
		
		 driver.findElement(getStarted).click();
		}
	
	public void dstitle() {
		
		driver.getTitle().equals("Data Structures-Introduction");
		}
	

	public void clickOntimecomplex() {
		
		 driver.findElement(timecomplex).click();
		}
	
	public void clickOntryheredata() {
		
		 driver.findElement(tryheredata).click();
		}
	
	public void entertextdata(String name) throws InterruptedException {
		String title = "Time Complexity: " + name;
		String pythonCode = "print '"+title+"'";
		driver.findElement(entertext).sendKeys(pythonCode);
		 Thread.sleep(300);
		}
	
	public void clickOnrundata() throws InterruptedException {
		
		 driver.findElement(rundata).click();
		 Thread.sleep(1000);
		}
	
	public void clickOnback() {
		
		driver.navigate().back();
		}
	
	public void pagetilte2() {
	driver.getTitle().equals("Time Complexity");
	
	}
}
