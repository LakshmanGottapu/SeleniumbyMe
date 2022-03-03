package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions option = new ChromeOptions();
option.addArguments("user-data-dir=C:\\Users\\91837\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
option.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(option);
driver.manage().window().maximize();
driver.get("https://www.facebook.com");

JavascriptExecutor js = ((JavascriptExecutor)driver);
js.executeScript("document.getElementById('email').value='lakshman'");
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
