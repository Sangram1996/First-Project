package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act = new Actions(driver);
		act.click(link).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("9937777731");

	}

}
