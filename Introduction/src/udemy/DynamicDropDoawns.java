package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDoawns {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver",
				"//Users//mubarekuyghurturk//Downloads//Drivers//chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		
		Slect s = new Slect(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		s.
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//driver.findElement(By.xpath("//option[@value='MAA']")).click();
		
		Thread.sleep(2000);

	}

}
