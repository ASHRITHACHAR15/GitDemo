package stepDefinitions;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.chechOutPage;
import pageObjects.landingPageObjects;
import pageObjects.pageObjectManager;
import utils.contextVariableRef;

public class landingPagestepDefinition {
	public WebDriver driver;
	contextVariableRef contextRef;
	pageObjectManager pageObjectManager;

	public String productName;
	public String offerProductName;
	landingPageObjects lpo;
	chechOutPage cpo;


	public landingPagestepDefinition(contextVariableRef contextRef) {
		this.contextRef = contextRef;
		this.lpo=contextRef.pageObjectManager.getLandingPage();
	}

	@Given("User is landed on GreenKart website homepage")
	public void user_is_landed_on_green_kart_website_homepage() throws IOException {
//		 String title= lpo.getTitle();
//		Assert.assertTrue(title.contains("GreenKart"));
         // BY Default contextVariableRef Constructor initiated webbrowser
		//contextRef.testBase.webDriverManager();
	}

	@When("^User searched with short name (.+) and extracted actual name of product$")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName)
			throws InterruptedException {
		//pageObjectManager= new pageObjectManager(driver);
		
		 
        //landingPageObjects lpo= new landingPageObjects(contextRef.driver);
	    lpo.searchProduct(shortName);
		
		contextRef.productName = lpo.getProductName().split("-")[0].trim();
		System.out.println(productName + "" + "is extracted from the product search on home page");
	}
	@When("added {string} items of selected products into cart")
	public void user_added_items_of_selected_products_into_cart(String string) throws InterruptedException {
	    
		lpo.incrementQuantity(Integer.parseInt(string));
		lpo.addToCart();
	}
}
