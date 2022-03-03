package launch;

public class TC_003 extends BasicTest{

	public static void main(String[] args) throws Exception{
	init();
	launch("chrome");
	navigate("amazon");
	selectOption("amazondropbox_id","Books");
	//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	typeText("amazonsearchtext_css","bags");
	clickElement("amazonsearchbutton_xpath");
	
	Thread.sleep(1500);
    driver.close();
	}

}
