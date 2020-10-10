import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parenthandel=driver.getWindowHandle();
		System.out.println(parenthandel);
		Set<String> windowhandels=driver.getWindowHandles();
		//windowhandels.remove(parenthandel);
		for(String wind:windowhandels){
			System.out.println(wind);
			driver.switchTo().window(wind);
			driver.close();
		}

}


}
