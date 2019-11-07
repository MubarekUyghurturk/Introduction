package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"//Users//mubarekuyghurturk//Downloads//Drivers//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("birsan.uyghur@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("malik01112015");
		driver.findElement(By.id("u_0_b")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		/*  CSS               Xpath
		 * #username           //*[@id="username"]
		 * #password           //*[@id="password"]
		 * #Login              //*[@id="Login"]
		 * //*[@id="logo"]
		 * #error
		 */
		
	}

}
