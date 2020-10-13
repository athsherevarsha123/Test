import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		ss(driver,"Google.png");
}
       public static void ss(WebDriver driver,String name) throws IOException{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File ScreenShot=ts.getScreenshotAs(OutputType.FILE);
		File ScreenShotSave=new File("./Screenshot/Google.png");
		Files.copy(ScreenShot, ScreenShotSave);
		driver.close();
		
	
		
	}
}
