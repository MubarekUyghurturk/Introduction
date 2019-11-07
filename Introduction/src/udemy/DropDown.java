package udemy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"//Users//mubarekuyghurturk//Downloads//Drivers//chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();;
		//driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Thread.sleep(2000);
		
		
		
			driver.findElement(By.id("//select[@id='ctl00_mainContent_ddl_Child']/option[4]")).click();
		
		
	
			//*[@id="ctl00_mainContent_ddl_Adult"]/option[3]
		
		
	}

}
