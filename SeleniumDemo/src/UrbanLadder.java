

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UrbanLadder {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
	    List<WebElement> menues=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	    for(WebElement menue : menues){
	    	System.out.println(menue.getText());
			
	    }
}
}
