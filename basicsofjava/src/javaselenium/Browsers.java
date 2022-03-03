package javaselenium;

public class Browsers {

	public static void main(String[] args) {
		WebDriver driver = new Firefox();
		driver.get("www.gooogle.com");
		driver.getCurrentUrl("https:\\www.google.com");
		driver.close();
		WebDriver driver1 = new ChromeWebDriver();
		driver1.get("www.gooogle.com");
		driver1.getCurrentUrl("https:\\www.google.com");
		driver1.close();
	}

}
