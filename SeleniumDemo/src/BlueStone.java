import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BlueStone {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(10000);
		WebElement ring=driver.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
		Actions a=new Actions(driver);
		a.moveToElement(ring).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class='menu-col-1 active']/descendant::a[text()='Diamond']")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']/parent ::a[@id='pid_26865']")).click();
	//	Set<String> wins=driver.getWindowHandles();
	//	for( String win:wins){
	//		driver.switchTo().window(win);
	//	}
	//	driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	//	Thread.sleep(2000);
	//	System.out.println(driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText());
			
		
		
}
}