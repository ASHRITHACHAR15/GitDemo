package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class chechOutPage {

		WebDriver driver;
		public  chechOutPage(WebDriver driver) {
			this.driver=driver;
		}

		By cart= By.xpath("//img[@alt='Cart']");
		By proceedToCheck= By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
		By promoButton = By.xpath("//button[@class='promoBtn']");
		By placeOrder = By.xpath("//button[normalize-space()='Place Order']");
		By checkOutPrdoductName= By.cssSelector("div[class='cart-preview active'] button[type='button']");
		
		public void addToCart(String string) {
			driver.findElement(cart).click();
		}
		
		public void proceedToCheckout() {
			 driver.findElement(proceedToCheck).click();
		}
		
		public boolean promoButton() {
			return driver.findElement(promoButton).isDisplayed();
			
		}
		public boolean placeOrder() {
			return driver.findElement(placeOrder).isDisplayed();
		}
		public String getCheckoutProductName() {
			return driver.findElement(checkOutPrdoductName).getText();
			
		}

		
	}


