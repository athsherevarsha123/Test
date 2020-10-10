import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class myntra {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//Thread.sleep(2000);
	    List<WebElement> menues=driver.findElements(By.xpath("//nav[@class='desktop-navbar']"));
	    for(WebElement menue : menues){
	    	System.out.println(menue.getText());
			
	    }
}

}
