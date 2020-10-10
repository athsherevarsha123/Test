import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class html1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait ww=new WebDriverWait(driver, 15);
		driver.get("file:///C:/Users/ABCD/Desktop/demo5.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement a= driver.findElement(By.xpath("//input[@name='textA']"));
	    a.sendKeys(" What is your name");
		ww.until(ExpectedConditions.textToBePresentInElementValue(a, " name"));
		driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("varsha");
		

}
}

