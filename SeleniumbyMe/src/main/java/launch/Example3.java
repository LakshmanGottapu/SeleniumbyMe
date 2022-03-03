package launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Example3 {
	
	public static void main(String[] args) throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
	
	List<WebElement> pages = driver.findElements(By.cssSelector("div#example_paginate>span>a"));
	for(int i=1;i<=pages.size();i++) {
		String pageSelector = "div#example_paginate>span>a:nth-child("+i+")";;
		driver.findElement(By.cssSelector(pageSelector)).click();
	 String str = driver.findElement(By.cssSelector("table#example>tbody>tr>td:nth-child(1)")).getText();
	 System.out.println(str);
	 Thread.sleep(2000);
	}
	
	}

}
