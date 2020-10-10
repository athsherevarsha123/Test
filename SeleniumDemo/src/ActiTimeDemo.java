import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTimeDemo {
	WebElement me= driver.findElement(By.id("username"));
		 username.sendKeys("admin");
		 WebElement password= driver.findElement(By.name("pwd"));
		 password.sendKeys("manager");
		 WebElement logInB= driver.findElement(By.id("loginButton"));
		 logInB.click();
		 WebElement logOutB=driver.findElement(By.id("logoutLink"));
		 System.out.println(logOutB.getText());
		 logOutB.click();
}

}
