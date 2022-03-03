package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Actions  a  = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']/p"));
		
		WebElement drop = driver .findElement(By.xpath("//div[@id='droppable']"));
		//a.clickAndHold(drag).moveToElement(drop).release().build().perform();
		a.dragAndDrop(drag, drop).perform();
	}

}
