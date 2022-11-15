package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPageObjects {
	
	public WebDriver driver;
	
	public landingPageObjects(WebDriver driver) {
		this.driver= driver;
	}

	By search= By.xpath("//input[@type='search']");
	By getProductName= By.cssSelector(" h4[class='product-name']");
	By topDeals= By.linkText("Top Deals");
	By addToCartIncrement = By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	public void searchProduct(String product) {
		driver.findElement(search).sendKeys(product);
	}
	public String getProductName() {
		return driver.findElement(getProductName).getText();
	}
	public void clickTopDeals() {
		driver.findElement(topDeals).click();
	}

   public void incrementQuantity(int quantity) {
	   int i= quantity-1;
	   while(i>0) {
		   driver.findElement(addToCartIncrement).click();
		  i--; 
	   } 
   }
   public void addToCart() {
	   driver.findElement(addToCart).click();
   }
}
