import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scroll {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		 WebElement searchBox= driver.findElement(By.name("q"));
		 searchBox.sendKeys("java",Keys.ENTER);
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("window.scrollBy(0,5000)");
		// WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		for(int i=0;i<=10;i++){
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,5000)");
			 WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
			 next.click();
		 }

}
}
