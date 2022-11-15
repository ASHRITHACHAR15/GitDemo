package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class contextVariableRef {

	public WebDriver driver;
	public String productName;
	public String CheckoutProductName;
	public pageObjectManager pageObjectManager;
	public testBase testBase;
	public genericUtils genericUtils ;
	public contextVariableRef() throws IOException {
		testBase = new testBase();
		pageObjectManager= new pageObjectManager(testBase.webDriverManager());
		genericUtils= new genericUtils(testBase.webDriverManager());
	}
	
	
}
