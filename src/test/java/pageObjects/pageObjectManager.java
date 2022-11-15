package pageObjects;

import org.openqa.selenium.WebDriver;


public class pageObjectManager {
	landingPageObjects lpo;
	offersPageObjects opo;
	chechOutPage cpo;
	WebDriver driver;
	
	public  pageObjectManager(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public landingPageObjects getLandingPage() {
		  lpo= new  landingPageObjects(driver);
		  return lpo;
	}
	
	public offersPageObjects getOfferPage() {
		opo= new offersPageObjects(driver);
		return opo;
	}
	public chechOutPage chechOutPage() {
		return cpo= new chechOutPage(driver);
	}
}
	
