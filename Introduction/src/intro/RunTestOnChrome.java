package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RunTestOnChrome {
	
	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver",
				"//Users//mubarekuyghurturk//Downloads//Drivers//chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.com"); // hit URL on the browser
	/*System.out.println(driver.getTitle());//validate if page title is correct
	
	System.out.println(driver.getCurrentUrl());// validate you are landing on current URL
	System.out.println(driver.getPageSource());
	
	//driver.get("http://amazon.com");
	
	
	driver.close();// it closes current browser
	driver.quit();// it close all the browsers opened by selenium script*/

	
	
	  
	
}
}