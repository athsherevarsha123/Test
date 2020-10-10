import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class urbanla1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
	    List<WebElement> menues=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	    Thread.sleep(1000);
	    for(WebElement menue : menues){
	    	System.out.println(menue.getText());
	    	a.moveToElement(menue).build().perform();
	    	Thread.sleep(1000);
			
	    }
}
}
