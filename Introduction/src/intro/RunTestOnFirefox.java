package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTestOnFirefox {

	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.gecko.driver", 
	    		"//Users//mubarekuyghurturk//Downloads//Drivers//geckodriver");
	    
	    WebDriver driver1 = new FirefoxDriver();
	    driver1.get("http://google.com");   
	    driver1.getTitle();
	    driver1.quit();

	}

}
