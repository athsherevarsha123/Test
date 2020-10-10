import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBook1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		 WebElement email= driver.findElement(By.id("email"));
		 email.sendKeys("madhuri");
		 WebElement password= driver.findElement(By.name("pass"));
		 password.sendKeys("mani1");
		// WebElement logInB= driver.findElement(By.id("loginButton"));
		// logInB.click();
		
}
}