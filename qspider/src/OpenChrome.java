import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.actitime.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement k=driver.findElement(By.xpath("//a[@class='button']"));
	k.click();
	WebElement n=driver.findElement(By.id("first-name"));
	n.sendKeys("SANGRAM");
	n.clear();
	WebElement m=driver.findElement(By.xpath("//body[contains(@class,'c-layout-header-fixed c-layout-header-mobile-fixed')]"));
	m.sendKeys("BADAL");
	
	}

}
