import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class goog1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		 WebElement search=driver.findElement(By.name("q"));
		 Point loc=search.getLocation();
		 //System.out.println(loc);
		 System.out.println("x-axis"+ loc.getX()+  "y-axis" + loc.getY());
		 
		// System.out.println(search.getAttribute("textcontent"));
		 search.sendKeys("java",Keys.ENTER);
		// driver.findElement(By.name("q")).clear();
		// driver.findElement(By.name("q")).sendKeys("movie",Keys.ENTER);
		


	
}
}
