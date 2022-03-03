package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Slider {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("user-data-dir=C:\\Users\\91837\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://www.amazon.in");
    ((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100)");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//driver.close();
	}

}
