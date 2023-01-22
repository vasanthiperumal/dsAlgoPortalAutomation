package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class stack {
	
	WebDriver driver;
	By getStartedQueue= By.xpath("//body/div[2]/div[4]/div[1]/div[1]/a[1]");
	By Operationsstack= By.xpath("//a[contains(text(),'Operations in Stack')]");
	By tryhere=By.xpath("//a[contains(text(),'Try here>>>')]");
	By textdata= By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]");
	By rundata=By.xpath("//button[contains(text(),'Run')]");
	By implementationstack=By.xpath("//a[contains(text(),'Implementation')]");
	By applicationstack=By.xpath("//a[contains(text(),'Applications')]");
	//By practicestack=By.xpath("//a[contains(text(),'Practice Questions')]");
	By HomePage=By.xpath("//a[contains(text(),'NumpyNinja')]");
	
	public stack(WebDriver driver) {
		this.driver=driver;
}
	
		public void CickongetStartedstack() {
		
		driver.findElement(getStartedQueue).click();
		 
		}
		
		public void getTitlestack() {
			
			driver.getTitle().equals("Stack");
		}
		
		public void CickonOperationsstack() {
			
			driver.findElement(Operationsstack).click();
			 
			}
		
		public void getTitleOperationsstack() {
			
			driver.getTitle().equals("Operations in Stack");
		}
		
		public void Cickonlinktryhere() {
			
			driver.findElement(tryhere).click();
			 
			}
		
		public void getTitleAssesement() {
			
			driver.getTitle().equals("Assessment");
		}
	
		public void entertextdata() throws InterruptedException {
			Thread.sleep(200);
			
			 driver.findElement(textdata).sendKeys("print \"Implementation of Queue\"");
			 Thread.sleep(200);
			}
		
		public void clickOnrundata() {
			
			 driver.findElement(rundata).click();
			}
		
		public void clickOnback() {
			
			driver.navigate().back();
			}
	
		public void Cickonimplementationstack() {
			
			driver.findElement(implementationstack).click();
			 
			}
		
		public void getTitleimplementationstack() {
			
			driver.getTitle().equals("Implementation");
		}
		
public void Cickonapplicationstack() {
			
			driver.findElement(applicationstack).click();
			 
			}
		
		public void getTitleapplicationstack() {
			
			driver.getTitle().equals("Applications");
		}
		
		public void goHomePage() {
			
			driver.navigate().back();
			driver.findElement(HomePage).click();
		}
		
		
		
}



