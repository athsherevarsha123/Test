import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class amazonss {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']")).click();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File ScreenShot=ts.getScreenshotAs(OutputType.FILE);
		File ScreenShotSave=new File("./Screenshot/amazon.png");
		Files.copy(ScreenShot, ScreenShotSave);
		
		
}
}
