package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class tree  {
	
	WebDriver driver;
	By getStartedTree = By.xpath("//body/div[2]/div[6]/div[1]/div[1]/a[1]");
	By OverviewofTrees=By.xpath("//a[contains(text(),'Overview of Trees')]");
	By tryhere=By.cssSelector("a[class='btn btn-info']");
	By entertext=By.xpath("//textarea[@tabindex='0']");
	By rundata=By.cssSelector("button[onclick='runit()']");
	By Terminologies=By.xpath("//a[contains(text(),'Terminologies')]");
	By TypesofTrees=By.xpath("//a[contains(text(),'Types of Trees')]");
	By TreeTraversals=By.xpath("//body/div[2]/div[1]/div[1]/div[1]/li[4]/a[1]");
	By TraversalsIllustration=By.xpath("//a[contains(text(),'Traversals-Illustration')]");
	By BinaryTrees=By.xpath("//body/div[2]/div[1]/div[1]/div[1]/li[6]/a[1]");
	By TypesBinaryTrees=By.xpath("//a[contains(text(),'Types of Binary Trees')]");
	By ImplementationPython=By.xpath("//a[contains(text(),'Implementation in Python')]");
	By BinaryTreeTraversals=By.xpath("//a[contains(text(),'Binary Tree Traversals')]");
	By ImplementationofBinaryTrees=By.xpath("//a[contains(text(),'Implementation of Binary Trees')]");
	By ApplicationsofBinarytrees=By.xpath("//a[contains(text(),'Applications of Binary trees')]");
	By BinarySearchTrees=By.xpath("//a[contains(text(),'Binary Search Trees')]");
	By ImplementationOfBST=By.xpath("//a[contains(text(),'Implementation Of BST')]");
	By HomePage=By.xpath("//a[contains(text(),'NumpyNinja')]");
	
	
	public tree(WebDriver driver) {
		this.driver=driver;
		}
	
	public void CickongetStartedTree() {		
		driver.findElement(getStartedTree).click();
		}
	
	public void getTitletree() {
		driver.getTitle().equals("Tree");
	}
	
	public void CickonOverviewofTrees() {		
		driver.findElement(OverviewofTrees).click();
		}
	
	public void getTitleOverviewofTrees() {
		driver.getTitle().equals("Overview of Trees");
	}
	
	public void Cickonlinktryhere() {
		driver.findElement(tryhere).click();
		}
	
	public void getTitleAssesement() {
		driver.getTitle().equals("Assessment");
	}
	
	public void entertextdata(String name) throws InterruptedException {
		String title = "Overview of Trees: " + name;
		String pythonCode = "print '"+title+"'";
		driver.findElement(entertext).sendKeys(pythonCode);

		}
	
	public void clickOnrundata() throws InterruptedException {
		
		 driver.findElement(rundata).click();
		 Thread.sleep(1500);
		}
	
	public void clickOnback() {
		
		driver.navigate().back();
		}
	
	public void CickonTerminologies() {		
		driver.findElement(Terminologies).click();
		}
	
	public void getTitleTerminologies() {
		driver.getTitle().equals("Terminologies");
	}
	
	public void CickonTreeTraversals() {		
		driver.findElement(TreeTraversals).click();
		}
	
	public void getTitleTreeTraversals() {
		driver.getTitle().equals("Tree Traversals");
	}
	
	public void CickonTypesofTrees() {		
		driver.findElement(TypesofTrees).click();
		}
	
	public void getTitleTypesofTrees() {
		driver.getTitle().equals("Types of Trees");
	}
	
	public void CickonTraversalsIllustration() {		
		driver.findElement(TraversalsIllustration).click();
		}
	
	public void getTitleTraversalsIllustration() {
		driver.getTitle().equals("Traversals-Illustration");
	}
	
	public void CickonBinaryTrees() {		
		driver.findElement(BinaryTrees).click();
		}
	
	public void getTitleBinaryTrees() {
		driver.getTitle().equals("Binary Trees");
	}
	
	public void CickonTypesBinaryTrees() {		
		driver.findElement(TypesBinaryTrees).click();
		}
	
	public void getTitleTypesBinaryTrees() {
		driver.getTitle().equals("Types of Binary Trees");
	}
	
	public void CickonImplementationPython() {		
		driver.findElement(ImplementationPython).click();
		}
	
	public void getTitleImplementationPython() {
		driver.getTitle().equals("Implementation in Python");
	}
	
	public void CickonBinaryTreeTraversals() {		
		driver.findElement(BinaryTreeTraversals).click();
		}
	
	public void getTitleBinaryTreeTraversals() {
		driver.getTitle().equals("Binary Tree Traversals");
	}
	
	public void CickonImplementationofBinaryTrees() {		
		driver.findElement(ImplementationofBinaryTrees).click();
		}
	
	public void getTitleImplementationofBinaryTrees() {
		driver.getTitle().equals("Implementation of Binary Trees");
	}
	
	
	
	public void CickonApplicationsofBinarytrees() {		
		driver.findElement(ApplicationsofBinarytrees).click();
		}
	
	public void getTitleApplicationsofBinarytrees() {
		driver.getTitle().equals("Applications of Binary trees");
	}
	
	public void CickonBinarySearchTrees() {		
		driver.findElement(BinarySearchTrees).click();
		}
	
	public void getTitleBinarySearchTrees() {
		driver.getTitle().equals("Binary Search Trees");
	}
	
	public void CickonImplementationOfBST() {		
		driver.findElement(ImplementationOfBST).click();
		}
	
	public void getTitleImplementationOfBST() {
		driver.getTitle().equals("Binary Search Trees");
	}
	
public void goHomePage() {
		
		driver.navigate().back();
		driver.findElement(HomePage).click();
	}
}
