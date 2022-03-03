package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggestion_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Hadoop Tutorial");
		  String val = driver.findElement(By.name("q")).getAttribute("value");
		 // System.out.println(val);
		 // driver.findElement(By.className("aajZCb"));
		 
		  String locator = "(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/span";
		List<WebElement> list = driver.findElements(By.xpath(locator));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase(val)) {
				list.get(i).click();
				break;
			}
			list = driver.findElements(By.xpath(locator));
		}
		 
	}

}
