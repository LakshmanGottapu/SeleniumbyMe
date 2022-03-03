package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='slider']/span"));
		a.dragAndDropBy(drag, 100, 0).perform();
		//a.clickAndHold(drag).moveByOffset(100, 0).release(drag).build().perform();
		driver.switchTo().defaultContent();
		
		//right click on element
		WebElement clickable = driver.findElement(By.linkText("Resizable"));
		a.contextClick(clickable).perform();
	}

}
