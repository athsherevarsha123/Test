import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
}

}
