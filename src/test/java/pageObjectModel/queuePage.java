package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class queuePage {
	
	WebDriver driver;
	By getStartedQueue= By.xpath("//body/div[2]/div[5]/div[1]/div[1]/a[1]");
	By ImplementationofQueue=By.xpath("//a[contains(text(),'Implementation of Queue in Python')]");
	By tryhere=By.xpath("//a[contains(text(),'Try here>>>')]");
	By textdata= By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]");
	By rundata=By.xpath("//button[contains(text(),'Run')]");
	By ImplementationCollections=By.xpath("//a[contains(text(),'Implementation using collections.deque')]");
	By ImplementationArray=By.xpath("//a[contains(text(),'Implementation using array')]");
	By QueueOperations=By.xpath("//a[contains(text(),'Queue Operations')]");
	By HomePage=By.xpath("//a[contains(text(),'NumpyNinja')]");
	
	public queuePage(WebDriver driver) {
		this.driver=driver;
}
	
		public void CickongetStartedQueue() {
		
		driver.findElement(getStartedQueue).click();
		 
		}
		
		public void getTitleQueue() {
			
			driver.getTitle().equals("Queue");
		}
		
		public void CickonImplementationofQueue() {
			
			driver.findElement(ImplementationofQueue).click();
			 
			}
		
		public void getTitleImplementationOfQueue() {
			
			driver.getTitle().equals("Implementation of Queue in Python");
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
	
	public void CickonImplementationofCollections() {
		
		driver.findElement(ImplementationCollections).click();
		 
		}
	
	public void getTitleImpleCollecdeque() {
		
		driver.getTitle().equals("Implementation using collections.deque");
	}
	
public void CickonImplementationArrays() {
		
		driver.findElement(ImplementationArray).click();
		 
		}

public void getTitleImplearray() {
	
	driver.getTitle().equals("Implementation using array");
}

public void CickonQueueOperations() {
	
	driver.findElement(QueueOperations).click();
	 
	}

public void getTitleOperations() {
	
	driver.getTitle().equals("Queue Operations");
}

public void goHomePage() {
	
	driver.navigate().back();
	driver.findElement(HomePage).click();
}
	
}
