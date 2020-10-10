import java.awt.AWTException;
import java.io.ObjectInputStream.GetField;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiSelect {
public static void main(String[] args) throws InterruptedException ,AWTException{
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ABCD/Desktop/demo4.html");
		Thread.sleep(2000);
		WebElement multi=driver.findElement(By.id("b"));
		Select  s=new Select(multi);
		if(s.isMultiple()){
			List<WebElement> opts=s.getOptions();
			s.selectByValue(opts.get(0).getText());
			Thread.sleep(2000);
			s.selectByValue(opts.get(2).getText());
			
		}
		List<WebElement> sopt=s.getAllSelectedOptions();
		for(WebElement so:sopt){
			System.out.println(so.getText());
		
		}
		//s.deselectByIndex(2);
		//s.deselectByValue("323");
		//s.deselectByVisibleText("323");
		s.deselectAll();

}
}
