import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class acti2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(10000);
			WebElement admin=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
			System.out.println(admin.getText());
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(admin.getText());
			
			WebElement pass=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		    System.out.println(pass.getText());
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass.getText());
		
			driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login')]")).click();
			Thread.sleep(2000);
			WebElement logout=driver.findElement(By.id("logoutLink"));
			System.out.println(logout.getText());
			logout.click();

		}
	}



