
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Flipkar1{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Black, 64 GB)']")).click();
			Thread.sleep(2000);
			
			Set<String> tabs =driver.getWindowHandles();
			for (String tab : tabs) {
				driver.switchTo().window(tab);
			}
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
			Thread.sleep(2000);

			

	}
	}


