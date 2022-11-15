package CucumberOptions;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features", glue="stepDefinitions",monochrome= true,tags="@searchProduct",
plugin= {"pretty","html:target/cucumber.html","rerun:target/failed_scenarios.txt", "json:target/cucumber.json", "junit:target/cucumber.xml", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunnerFile extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}
}


