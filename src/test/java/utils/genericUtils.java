package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {
	public WebDriver driver;
	 public  genericUtils(WebDriver driver) {
		 this.driver=driver;
	 }

	public void switchWindowToChild() {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
	}
	
}
