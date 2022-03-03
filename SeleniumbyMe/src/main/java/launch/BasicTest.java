package launch;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	static WebDriver driver;
	static Properties p;
	static FileInputStream fis;
	static Properties browserprop;
	static Properties serverprop;
	static String projectpath = System.getProperty("user.dir");
	static Properties amazonprop;
	public static void init() throws Exception {
		 fis = new FileInputStream(projectpath+"/src/main/resources/Browser.properties");
		browserprop = new Properties();
		browserprop.load(fis);
		
		 fis = new FileInputStream(projectpath+"/src/main/resources/environment.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectpath+"/src/main/resources/"+p.getProperty("env")+".properties");
		serverprop = new Properties();
		serverprop.load(fis);
		
		fis = new FileInputStream(projectpath+"/src/main/resources/amazon.properties");
		amazonprop = new Properties();
		amazonprop.load(fis);
		
		fis = new FileInputStream(projectpath+"/src/main/resources/log4jconfig.properties");
		PropertyConfigurator.configure(fis);
		
		
	}
	public static void launch(String browser)
	{
		if(browserprop.getProperty(browser).equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\91837\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
		}
		else if(browserprop.getProperty(browser).equals("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();
			ProfilesIni p = new ProfilesIni();
			 FirefoxProfile fox = p.getProfile("Lakshman'sFox");
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(fox);
			fox.setPreference("dom.webnotifications.enabled",false);
			
			driver = new FirefoxDriver(option);
			//driver = new FirefoxDriver();
			
		}
		else if(browserprop.getProperty(browser).equals("edgebrowser")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}
	public static WebElement getElement(String locatorkey) {
		if(!isElementPresent(locatorkey)) {
			System.out.println(locatorkey+" doesnt exist");
			return null;
			}
		return driver.findElement(getLocator(locatorkey));
	}
	public static boolean isElementPresent(String locatorkey) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorkey)));
		} catch (Exception e) {
			return false;
		}
		return true;
		
	}
	public static By getLocator(String locatorkey) {
		By by = null;
		if(locatorkey.endsWith("_id"))	                { by = By.id(amazonprop.getProperty(locatorkey));}
		else if(locatorkey.endsWith("_css"))	        { by = By.cssSelector(amazonprop.getProperty(locatorkey));}
		else if(locatorkey.endsWith("_xpath"))	        { by = By.xpath(amazonprop.getProperty(locatorkey));}
		else if(locatorkey.endsWith("_classname"))      { by = By.className(amazonprop.getProperty(locatorkey));}
		else if(locatorkey.endsWith("_name"))	        { by = By.name(amazonprop.getProperty(locatorkey));}
		else if(locatorkey.endsWith("_linktext"))       { by = By.linkText(amazonprop.getProperty(locatorkey));}
		else if(locatorkey.endsWith("_partiallinktext")){ by = By.partialLinkText(amazonprop.getProperty(locatorkey));}
		return by;
	}
	public static void navigate(String url) {
		driver.get(serverprop.getProperty(url));
	}
	public static void selectOption(String locatorkey,String value) {
		getElement(locatorkey).sendKeys(value);
	}
	public static void typeText(String locatorkey,String text) {
		getElement(locatorkey).sendKeys(text);
	}
	public static void clickElement(String locatorkey) {
		getElement(locatorkey).click();
	}
	
}
