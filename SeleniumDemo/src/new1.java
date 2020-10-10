
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class new1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		//WebElement day=driver.findElement(By.id("day"));
		//Select dy=new Select(day);
		//dy.selectByIndex(9);
	//	Thread.sleep(2000);
		WebElement month=driver.findElement(By.id("month"));
		Select mon=new Select(month);
		List<WebElement> months=mon.getOptions();
		Set<String> set=new TreeSet<String>();
		for(WebElement mn:months){
			System.out.println(mn.getText());
			set.add(mn.getText());
			if(mn.getText().equalsIgnoreCase("May"))
				mon.selectByVisibleText("May");
			
		}
		System.out.println("==============================================");
		for(String mn:set){
			System.out.println(mn);
		}
		Thread.sleep(2000);
		//WebElement year=driver.findElement(By.id("year"));
		//Select y=new Select(year);
		//y.selectByValue("2020");
		
		

}
}
