

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement coin= driver.findElement(By.xpath("//a[@title='Coins']"));
		a.moveToElement(coin).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();
		Thread.sleep(2000);
	}

}