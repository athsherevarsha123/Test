import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipkart1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
	    List<WebElement> menues=driver.findElements(By.xpath("//div[@class='_1OSP27']/span"));
	    Thread.sleep(1000);
		for(WebElement menue : menues){
	    	String name=menue.getText();
	    	System.err.println(name);
	    	a.moveToElement(menue).build().perform();
	    	Thread.sleep(3000);
			List<WebElement> subMenues=driver.findElements(By.xpath("//span[contains(.,'"+ name +"')]/parent::div/descendant::div[@class=\"_35d-dw\"]/a"));
			for (WebElement subMenuesName :subMenues){
				System.out.println(subMenuesName.getText());
				//Thread.sleep(1000);
			}
				
			}
	    }


}
