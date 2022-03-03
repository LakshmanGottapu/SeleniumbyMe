package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.snapdeal.com/");
    WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
    Actions action = new Actions(driver);
    action.moveToElement(signin).perform();
    driver.findElement(By.xpath("(//div[@class='accountList']/ul)[2]/li[2]/a")).click();
    Thread.sleep(2000);
    driver.close();
    
}
}
