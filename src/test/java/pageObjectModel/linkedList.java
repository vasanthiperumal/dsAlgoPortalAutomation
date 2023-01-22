package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class linkedList {
	
	WebDriver driver;
	By getstartedlinklist =By.xpath("//body/div[2]/div[3]/div[1]/div[1]/a[1]");
	By introductionLink = By.xpath("//a[contains(text(),'Introduction')]");
	By linktryhere =By.xpath("//a[contains(text(),'Try here>>>')]");
	By textdata= By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]");
	By rundata=By.xpath("//button[contains(text(),'Run')]");
	By createLinkedListLink = By.xpath("//a[contains(text(),'Creating Linked LIst')]");
	By typesOfLinkedListLink = By.xpath("//a[contains(text(),'Types of Linked List')]");
	By implementedList = By.xpath("//a[contains(text(),'Implement Linked List in Python')]");
	By linkedListPython = By.xpath("//a[contains(text(),'Implement Linked List in Python')]");
	By traversal = By.xpath("//a[contains(text(),'Traversal')]");
	By insertion = By.xpath("//a[contains(text(),'Insertion')]");
	By deletion = By.xpath("//a[contains(text(),'Deletion')]");
	
	public linkedList(WebDriver driver) {
			this.driver=driver;
	}

	public void CickonGetStarted() {
		
		driver.findElement(getstartedlinklist).click();
		 
		}
	
	public void getTitleLinkedList() {
		
		driver.getTitle().equals("Linked List");
	}
	
public void Cickonintroduction() {
		
		driver.findElement(introductionLink).click();
		 
		}

public void getTitleIntro() {
	
	driver.getTitle().equals("Introduction");
}

public void getTitleAssesement() {
	
	driver.getTitle().equals("Assessment");
}

	
	public void Cickonlinktryhere() {
		
		driver.findElement(linktryhere).click();
		 
		}
	
	public void entertextdata() throws InterruptedException {
		Thread.sleep(3000);
		
		 driver.findElement(textdata).sendKeys("print \"DataStructure Introduction\"");
		 Thread.sleep(3000);
		}
	
	public void clickOnrundata() {
		
		 driver.findElement(rundata).click();
		}
	
public void clickOnback() {
		
		driver.navigate().back();
		}
	
public void CickoncreateLinked() {
		
		driver.findElement(createLinkedListLink).click();
		 
		}
	
public void CickonlinkedList() {
		
		driver.findElement(linkedListPython).click();
		 
		}
	
public void CickontypesOfLinked() {
		
		driver.findElement(typesOfLinkedListLink).click();
		 
		}

public void CickonImplementedlist() {
	
	driver.findElement(implementedList).click();
	 
	}
	
	public void Cickontraversal() {
		
		driver.findElement(traversal).click();
		 
		}
	
public void Cickoninsertion() {
		
		driver.findElement(insertion).click();
		 
		}

public void Cickondeletion() {
	
	driver.findElement(deletion).click();
	 
	}
	



	
}
