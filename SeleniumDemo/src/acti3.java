import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class acti3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(10000);
		WebElement admin=driver.findElement(By.xpath("//b[cthntains(.,'admin')]"));
		System.out.println(admin.getText());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(admin.getText());
		
		WebElement pass=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	    System.out.println(pass.getText());
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass.getText());
	
		driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menu_icon']/ancestor::div[@class='popup_menu_button popup_menu_button_support']")).click();
		WebElement menue=driver.findElement(By.id("popup_menu_support_createAccountColleague"));
		System.out.println(menue.getText());
		
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.id("logoutLink"));
		System.out.println(logout.getText());
		logout.click();

	}

}
