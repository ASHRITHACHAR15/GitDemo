package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offersPageObjects {
	WebDriver driver;
	public  offersPageObjects(WebDriver driver) {
		this.driver=driver;
	}

	By offerSearch= By.xpath("//input[@type='search']");
	By getProduct= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]");
	
	public void searchOfferProduct(String string) {
		driver.findElement(offerSearch).sendKeys(string);
	}
	
	public String getOfferProduct() {
		return driver.findElement(getProduct).getText();
	}
	
}
