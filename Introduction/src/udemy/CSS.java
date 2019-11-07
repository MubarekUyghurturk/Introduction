package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.findElement(By.cssSelector("[class='identity first']")).sendKeys("mubarek");

	}

}
