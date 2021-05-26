package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuit {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.actitime.com");
	Thread.sleep(5000);
	driver.findElement(By.linkText("actiTimeInc.")).click();
	driver.close();
	
	}

}
