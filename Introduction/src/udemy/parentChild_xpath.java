package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChild_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"//Users//mubarekuyghurturk//Downloads//Drivers//chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).
		       sendKeys("uyghur");
		driver.findElement(By.name("gN089b")).click();
		
	

	}

}
