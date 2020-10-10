import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class goog {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> sugg=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		Thread.sleep(2000);
		for(WebElement sug:sugg){
			System.out.println(sug.getText());
		}
		sugg.get(2).click();
		Actions a= new Actions(driver);
		Thread.sleep(2000);
		WebElement books=driver.findElement(By.xpath("//a[contains(.,'Books')]"));
		a.contextClick(books).perform();
}
	
		 
		
}
