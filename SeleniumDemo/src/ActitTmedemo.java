import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActitTmedemo {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		/* WebElement username= driver.findElement(By.id("username"));
		 * username.sendKeys("admin");
		 * WebElement password= driver.findElement(By.name("pwd"));
		 * password.sendKeys("manager");
		 * WebElement logInB= driver.findElement(By.id("loginButton"));
		 * logInB.click();
	     * WebElement logOutB=driver.findElement(By.id("logoutLink"));
	     *  logOutB.click();
         */
		driver.findElement(By.partialLinkText("actiTIME")).click();
		Set<String> tabs=driver.getWindowHandles();
		for(String tab:tabs){
			driver.switchTo().window(tab);
		}
		System.out.println(driver.getTitle());
}
}
