package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.contextVariableRef;

public class Hooks {
	contextVariableRef contextRef;
	WebDriver driver;

	public Hooks(contextVariableRef contextRef) {
		this.contextRef= contextRef;
	}
	@After
	public void quitBrowser() throws IOException {
		contextRef.testBase.webDriverManager().quit();
	}
	@AfterStep
	public void takeScreenShot(Scenario scenario) throws IOException {
		WebDriver driver= contextRef.testBase.webDriverManager();
		if(scenario.isFailed()) {
		File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent=FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(filecontent,"image/png","image");
		
	}
}
}
