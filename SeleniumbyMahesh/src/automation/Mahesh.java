package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mahesh {
static WebDriver driver;
public static void chrome() {
	System.setProperty("webdriver.chrome.driver","D:\\Work\\library\\driver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.seleniumbymahesh.com/");
}
public static void verifylogin(){
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin");
driver.findElement(By.name("submit")).click();
}
public static void verifylogout() {
	
}
public static void registration() {
	driver.findElement(By.linkText("Registration")).click();
	driver.findElement(By.name("PATIENT_CAT")).sendKeys("Self");
	driver.findElement(By.name("TITLE")).sendKeys("Mr");
	driver.findElement(By.name("PNT_NAME")).sendKeys("naveen");
	driver.findElement(By.name("LAST_NAME")).sendKeys("kumar");
	driver.findElement(By.name("DOB")).sendKeys("14-04-1996");
	driver.findElement(By.name("AGE")).sendKeys("26");
	driver.findElement(By.name("SEX")).sendKeys("Male");
	driver.findElement(By.name("MTRL_STATUS")).sendKeys("Single");
	driver.findElement(By.name("RELIGION")).sendKeys("Hindu");
	driver.findElement(By.name("PLANGUAGE")).sendKeys("Telugu");
	driver.findElement(By.name("RELATION")).sendKeys("Brother");
	driver.findElement(By.name("PAT_IDENTITY")).sendKeys("Others");
	driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("2348");
	driver.findElement(By.name("NATIONALITY")).sendKeys("Indian");
	driver.findElement(By.name("IS_MLC")).sendKeys("Yes");
	driver.findElement(By.name("EDUCATION")).sendKeys("MCA");
	driver.findElement(By.name("OCCUPATION")).sendKeys("Employee");
	driver.findElement(By.name("BLOOD_GRP_CODE")).sendKeys("B+");
	driver.findElement(By.name("CITIZENSHIP")).sendKeys("Indian");
	driver.findElement(By.name("SC_PROOF")).sendKeys("Yes");
	driver.findElement(By.name("ADDRESS1")).sendKeys("pathebad");
	driver.findElement(By.name("MOBILE_NO")).sendKeys("8309951482");
	driver.findElement(By.name("COUNTRY_CODE")).sendKeys("India");
	driver.findElement(By.name("ZIP")).sendKeys("534003");
	driver.findElement(By.name("image")).sendKeys("C:\\Users\\91837\\Downloads\\download.jpg");
	driver.findElement(By.name("submit")).click();
	
}

public static void main(String[] args) throws Exception {
	chrome();
	driver.findElement(By.linkText("HMS")).click();
	verifylogin();
	registration();
	String str = driver.switchTo().alert().getText();
	System.out.println(str);
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	driver.quit();
}
}