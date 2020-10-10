import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTimeDemo1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		 WebElement username= driver.findElement(By.id("username"));
		 username.sendKeys("admin");
		 WebElement password= driver.findElement(By.name("pwd"));
		 password.sendKeys("manager",Keys.ENTER);
		 WebElement logInB= driver.findElement(By.id("loginButton"));
		 logInB.click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("logoutLink")).click();
		 
}

}
