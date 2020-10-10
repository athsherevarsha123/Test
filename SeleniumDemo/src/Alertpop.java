import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertpop {
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
		 driver.findElement(By.xpath("//div[@class='menu_icon']/ancestor::div[@class='popup_menu_button popup_menu_button_support']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		 WebElement li=driver.findElement(By.xpath("//span[@class='productVersion']"));
			System.out.println(li.getText());
			
}
}
