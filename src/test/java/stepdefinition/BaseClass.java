package stepdefinition;

import static stepdefinition.DriverManager.getDriver;

import org.openqa.selenium.WebDriver;

import pageObjectModel.array;
import pageObjectModel.dataStructure;
import pageObjectModel.graphPage;
import pageObjectModel.homePage;
import pageObjectModel.linkedList;
import pageObjectModel.queuePage;
import pageObjectModel.registration;
import pageObjectModel.signInstep;
import pageObjectModel.stack;
import pageObjectModel.tree;

public class BaseClass {
	
	public static WebDriver driver;

    public	static signInstep lk;
    public static registration nr;
    public static homePage hp;
    public static dataStructure ds;
    public static linkedList ll;
    public static queuePage qp;
    public static stack sp;
    public static array ap;
    public static tree tp;
    public static graphPage gp;
	static
	{
		driver=getDriver();
	}
    

}
