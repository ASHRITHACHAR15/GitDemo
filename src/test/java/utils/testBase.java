package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {
	
	WebDriver driver;
    public WebDriver webDriverManager() throws IOException {
    	FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resources\\global.properties");
    	Properties prop= new Properties();
    	prop.load(fs);
    	String propBrowser=prop.getProperty("browser");
    	String mavenBrowser=System.getProperty("browser");
    	String Url= prop.getProperty("QAUrl");
    	//result= testCondition? value1:value2
    	
    	String browser=mavenBrowser!=null? mavenBrowser : propBrowser;
    	if(browser.equalsIgnoreCase("chrome")) {
    	
    	
    	if(driver==null) {
    	System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+"\\src\\test\\Resources\\chromedriver.exe"));
		driver = new ChromeDriver();
    	}
    	}
    	if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
    		//code for FireFox
    	}
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Url);
    
		return driver;
    }
}
