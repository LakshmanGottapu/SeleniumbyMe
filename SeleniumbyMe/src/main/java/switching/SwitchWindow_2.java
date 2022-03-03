package switching;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    ChromeOptions option = new ChromeOptions();
   option.addArguments("--disable-notifications");
    WebDriver driver = new ChromeDriver(option);
    driver.manage().window().maximize();
    driver.get("https://www.icicibank.com/");
    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	/*
	 * System.out.println(driver.getTitle()); String parentWindow =
	 * driver.getWindowHandle(); System.out.println(parentWindow);
	 */
	
	
	/*
	 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 * while(!wait.until(ExpectedConditions.presenceOfElementLocated(By.
	 * xpath("//img[@alt='personal loan'][@class='lazy loaded']"))).isDisplayed()){
	 * System.out.println("in the loop"); driver.findElement(By.
	 * xpath("//div[@class='banner-slider i-home-banner desktop slick-initialized slick-slider slick-dotted']/button[@class='slick-next slick-arrow']"
	 * )).click(); } driver.findElement(By.
	 * xpath("//img[@alt='personal loan'][@class='lazy loaded']")).click();
	 */
	 
    driver.switchTo().frame(driver.findElement(By.id("iframe-full-height")));
   driver.findElement(By.xpath("(//input[@id='name'][@class='input-name'])[1]")).sendKeys("lakshman");
   driver.switchTo().defaultContent();
   Thread.sleep(2000);
	/*
	 * for(int i=0;i<3;i++) { driver.findElement(By.
	 * xpath("//div[@class='banner-slider i-home-banner desktop slick-initialized slick-slider slick-dotted']/button[@class='slick-next slick-arrow']"
	 * )).click(); Thread.sleep(500); }
	 */
   driver.findElement(By.xpath("//div[@class='banner-slider i-home-banner desktop slick-initialized slick-slider slick-dotted']/button[@class='slick-next slick-arrow']"
			 )).click();
	}

}
