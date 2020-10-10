import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Droppable {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Actions a=new Actions(driver);
		WebElement draggable=driver.findElement(By.id("draggable"));
		a.dragAndDropBy(draggable, 120, 0).perform();
		WebElement drophere=driver.findElement(By.xpath("//p[contains(.,'Drop here')]/parent::div[@id='droppable']"));
		System.out.println(drophere.getText());
}


}
