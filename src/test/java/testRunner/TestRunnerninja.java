package testRunner;

import org.junit.runner.RunWith;

//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = "@tagRegistration",//Registration
		//tags= "@tagLogin",//Login
		//tags= "@tagLogin or @tagDataStructure",//DataStructure
		//tags= "@tagHome",//HomePage
		//tags = "@tagLogin or @taglinkIntro or @tagcreatelink or @taglinkedlist or @tagimplementlist or @tagTraversal or @tagInsertion or @tagDeletion",//Linktext
		//tags = "@tagLogin or @tagStackOperations or @tagStackImplementation or @tagStackApplications",//Stack
		//tags = "@tagLogin or @tagImplementation or @tagImplementationdeque or @tagImplementationarray or @tagImplementationOperations",//Queue
		//tags= "@tagLogin or @tagarray or @tagarraylist or @tagarraybasic or @tagarrayapplications or @tagarraypractice or @tagarraypracticesearch or @tagarraypracticemax or @tagarraypracticeeven or @tagarraypracticesquare",//Array
		//tags= "@tagLogin or @tagtree or @tagtreeTerminologies or @tagtreeTypes or @tagtreeTraversals or @tagtreeIllustration or @tagtreeBinary or @tagtreeBinaryTrees or @tagtreeImplementation or @tagtreeBinaryTraversals or @tagtreeImplementationBinary or @tagtreeApplications or @tagtreeBinarySearch or @tagtreeBST",//Tree
		//tags="@tagLogin or @taggraph or @taggraphrep",//Graph Page
	//tags="@tagLogin or @tagDataStructure or @taglinkIntro or @tagcreatelink or @taglinkedlist or @tagimplementlist or @tagTraversal or @tagInsertion or @tagDeletion or @tagStackOperations or @tagStackImplementation or @tagStackApplications or @tagImplementation or @tagImplementationdeque or @tagImplementationarray or @tagImplementationOperations or @tagarray or @tagarraylist or @tagarraybasic or @tagarrayapplications or @tagarraypractice or @tagarraypracticesearch or @tagarraypracticemax or @tagarraypracticeeven or @tagarraypracticesquare or @tagtree or @tagtreeTerminologies or @tagtreeTypes or @tagtreeTraversals or @tagtreeIllustration or @tagtreeBinary or @tagtreeBinaryTrees or @tagtreeImplementation or @tagtreeBinaryTraversals or @tagtreeImplementationBinary or @tagtreeApplications or @tagtreeBinarySearch or @tagtreeBST or @taggraph or @taggraphrep  or @tagRegistration or @tagHome",   
		
		features="src/test/resources/Features",
		glue={"stepdefinition"},
		plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml","html:target/HtmlReports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				})


/*@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 3,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
//coverageReport = true,
jsonUsageReport = "target/cucumber-usage.json",
usageReport = true,
toPDF = true,
//excludeCoverageTags = {"@flaky" },
includeCoverageTags = {"@tag2" },
outputFolder = "target")
*/

public class TestRunnerninja {

}
