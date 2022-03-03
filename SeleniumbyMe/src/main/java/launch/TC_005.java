package launch;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TC_005 extends BasicTest{
private static final Logger log = Logger.getLogger(TC_005.class);
	private static ExtentHtmlReporter htmlreporter;
//	public static ExtentReports reports =
	public static void main(String[] args) throws Exception{
	init();
	log.info("load all the properties inherited from the parent class BasicTest");
	launch("chrome");
	log.info("launch the "+ browserprop.getProperty("chrome"));
	navigate("amazon");
	log.info("navigate the driver to "+serverprop.getProperty("amazon"));
	selectOption("amazondropbox_id","Books");
	log.info("selected the option Books in the dropdownbox");
	//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	typeText("amazonsearchtext_css","bags");
	log.info("Text _bags_ has been written in the searchbox");
	clickElement("amazonsearchbutton_xpath");
	log.info("search button is clicked");
	Thread.sleep(1500);
    driver.close();
	}

}
