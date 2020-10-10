import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demogoogle {
public static void main(String[] args) throws InterruptedException ,AWTException{
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Robot r=new Robot();
	     WebElement searchBox= driver.findElement(By.name("q"));
		 searchBox.sendKeys("java");
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 WebElement doubleclick=driver.findElement(By.xpath("//h2[@class='qrShPb kno-ecr-pt PZPZlf mfMhoc']/span"));
			Actions a=new Actions(driver);
			a.doubleClick(doubleclick).build().perform();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_CONTROL);
	        r .keyRelease(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		

}
}
//span[contains(.,'Java')]/parent::h2