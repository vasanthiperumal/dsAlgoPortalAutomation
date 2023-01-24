package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class array {
	
	WebDriver driver;
	By getStartArray =By.xpath("//body/div[2]/div[2]/div[1]/div[1]/a[1]");
	By ArraysinPython =By.xpath("//a[contains(text(),'Arrays in Python')]");
	By tryhere =By.cssSelector("a[class='btn btn-info']");
	By entertext=By.xpath("//textarea[@tabindex='0']");
	By rundata=By.cssSelector("button[onclick='runit()']");
	By arraylist =By.xpath("//a[contains(text(),'Arrays Using List')]");
	By arraybasicOperations =By.xpath("//a[contains(text(),'Basic Operations in Lists')]");
	By applicationsarray =By.xpath("//a[contains(text(),'Applications of Array')]");
	By arrayPractice =By.xpath("//a[contains(text(),'Practice Questions')]");
	By searcharray =By.xpath("//a[contains(text(),'Search the array')]");
	By practicetextdata=By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
    //By practicetextdata=By.xpath("//body[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]");
	By arraymax =By.xpath("//a[contains(text(),'Max Consecutive Ones')]");
	By arrayfindnumbers =By.xpath("//a[contains(text(),'Find Numbers with Even Number of Digits')]");
	By arraysquares =By.xpath("//a[contains(text(),'a Sorted Array')]");
	By HomePage=By.xpath("//a[contains(text(),'NumpyNinja')]");
	
	public array(WebDriver driver) {
		this.driver=driver;
		}
	
	public void CickongetStartedarray() {		
		driver.findElement(getStartArray).click();
		}
	
	public void getTitlearray() {
		driver.getTitle().equals("Array");
	}
	
	public void CickonArraysinPython() {		
		driver.findElement(ArraysinPython).click();
		}
	
	public void getTitleArraysinPython() {
		driver.getTitle().equals("Arrays in Python");
	}
	
	public void Cickonlinktryhere() {
		driver.findElement(tryhere).click();
		}
	
	public void getTitleAssesement() {
		driver.getTitle().equals("Assessment");
	}
	
	public void entertextdata(String name) throws InterruptedException {
		String title = "Arrays in Python: " + name;
		String pythonCode = "print '"+title+"'";
		driver.findElement(entertext).sendKeys(pythonCode);
		}
	
	public void clickOnrundata() {
		
		 driver.findElement(rundata).click();
		 
		}
	
	public void clickOnback() {
		
		driver.navigate().back();
		}
	
	public void Cickonarraylist() {		
		driver.findElement(arraylist).click();
		}
	
	public void getTitlearraylist() {
		driver.getTitle().equals("Arrays Using List");
	}
	
	public void CickonarraybasicOperations() {		
		driver.findElement(arraybasicOperations).click();
		}
	
	public void getTitlebasicOperations() {
		driver.getTitle().equals("Basic Operations in Lists");
	}
	
	public void Cickonapplicationsarray() {		
		driver.findElement(applicationsarray).click();
		}
	
	public void getTitleApplications() {
		driver.getTitle().equals("Applications of Array");
	}
	
	public void CickonarrayPractice() {		
		driver.findElement(arrayPractice).click();
		}
	
	public void getTitlePractice() {
		driver.getTitle().equals("Practice Questions");
	}

	public void Cickonsearcharray() {		
		driver.findElement(searcharray).click();
		}
	
		
	public void practicetextdata(String name) throws InterruptedException {	
		Thread.sleep(200);
		//driver.findElement(practicetextdata).clear();
		driver.findElement(practicetextdata).sendKeys(Keys.CONTROL,"a");
		driver.findElement(practicetextdata).sendKeys(Keys.DELETE);
		Thread.sleep(200);
		String title = "Search the array: " + name;
		String pythonCode = "print '"+title+"'";
		driver.findElement(entertext).sendKeys(pythonCode);
		Thread.sleep(200);
		}
	
	public void Cickonarraymax() {		
		driver.findElement(arraymax).click();
		}
	
	public void Cickonarrayfindnumbers() {		
		driver.findElement(arrayfindnumbers).click();
		}
	
	public void Cickonarraysquares() {		
		driver.findElement(arraysquares).click();
		}
	
	public void goHomePage() {
		
		driver.navigate().back();
		driver.findElement(HomePage).click();
	}
	
	
	
	
}
