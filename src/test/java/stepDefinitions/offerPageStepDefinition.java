package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.landingPageObjects;
import pageObjects.offersPageObjects;
import pageObjects.pageObjectManager;
import utils.contextVariableRef;

public class offerPageStepDefinition {
	//SINGLE RESPONSIBILITY PRINCIPLE
	//LOSSLEY COUPLED CLASS
	//FACTORY DESIGN PROCESS
	public contextVariableRef contextRef;
	public String offerProductName ;
	pageObjectManager pageObjectManager;

	public offerPageStepDefinition(contextVariableRef contextRef) {
		this.contextRef = contextRef;

	}

	@Then("^User searched for same name (.+) in the offers page to check if product exist$")
	public void user_searched_for_same_name_in_the_offers_page_to_check_if_product_exist(String string)
			throws InterruptedException, IOException {
		switchToWindow();
		offersPageObjects opo= contextRef.pageObjectManager.getOfferPage();
		//offersPageObjects opo= new offersPageObjects(contextRef.driver);
		opo.searchOfferProduct(string);
		offerProductName = opo.getOfferProduct();
		System.out.println(offerProductName + "" + "is extracted from the product search on offer page");
		//assertMethods();
		//assert.assertEquals(contextRef.productName,offerProductName);
         
		//contextRef.testBase.webDriverManager().quit();

		// Write code here that turns the phrase above into concrete actions
	}

	public void switchToWindow() {
		//pageObjectManager=new pageObjectManager(contextRef.driver);
		landingPageObjects lpo=contextRef.pageObjectManager.getLandingPage();
		//landingPageObjects lpo = new landingPageObjects(contextRef.driver);
		lpo.clickTopDeals();
		contextRef.genericUtils.switchWindowToChild(); //parse string, Explicit wait
		/*
		 * Set<String> set = contextRef.driver.getWindowHandles(); 
		 * Iterator<String> it =set.iterator();
		 * @SuppressWarnings("unused") String parentWindow = it.next(); 
		 * String childWindow = it.next(); contextRef.driver.switchTo().window(childWindow);
		 */
	}
public void assertMethods() {
	Assert.assertEquals(contextRef.productName,offerProductName);
}
}
