
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
@BeforeMethod
public void launch() {
	System.out.println("chrome launched");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
}

@Test
public void GoogleTitle() {
	System.out.println(driver.getTitle());
}
@Test
public void GoogleSearch() {
	System.out.println("got the Search");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("sunnyleone");
}
@Test
public void GoogleLogo() {
	System.out.println("got the logo");
}
@AfterMethod
public void close(){
	driver.close();
	
}

}

