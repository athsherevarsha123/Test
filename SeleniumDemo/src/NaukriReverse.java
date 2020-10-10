import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NaukriReverse {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parenthandel=driver.getWindowHandle();
		System.out.println(parenthandel);
		Set<String> allwindohandels=driver.getWindowHandles();
		List<String> lst= new ArrayList<String>(allwindohandels);
		//windowhandels.remove(parenthandel);
		for(int i=lst.size()-1;i>=0;i--){
			System.out.println(lst.get(i));
			driver.switchTo().window(lst.get(i));
			driver.close();
		}
}		
}
