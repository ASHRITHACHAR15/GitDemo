package stepDefinitions;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.chechOutPage;
import pageObjects.landingPageObjects;
import pageObjects.pageObjectManager;
import utils.contextVariableRef;

public class checkoutPageStepDefinition {
	
	    public chechOutPage cpo;
		public WebDriver driver;
		contextVariableRef contextRef;
		pageObjectManager pageObjectManager;
		public String CheckoutProductName;

		

		public checkoutPageStepDefinition(contextVariableRef contextRef) {
			this.contextRef = contextRef;
			 cpo=contextRef.pageObjectManager.chechOutPage();
		}
		

		@Then("^User proceeds to checkout page and validate the (.+) present in checkout page$")
		public void user_proceeds_to_checkout_page_and_validate_the_tom_present_in_checkout_page(String name) throws InterruptedException {
			
			
			cpo.proceedToCheckout();
			contextRef.CheckoutProductName= cpo.getCheckoutProductName().split("-")[0].trim();
			Assert.assertEquals(name,CheckoutProductName);
			
		}

		@Then("Verify User has ability to enter promocode and place the order")
		public void verify_user_has_ability_to_enter_promocode_and_place_the_order() {
			//cpo[chechOutPage()] is initiated in constructor itself
			
			Assert.assertTrue(cpo.promoButton());
			Assert.assertTrue(cpo.placeOrder());
		  
		}
}
