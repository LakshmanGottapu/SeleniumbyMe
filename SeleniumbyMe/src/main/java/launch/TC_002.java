package launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class TC_002 extends BasicTest{

	public static void main(String[] args) throws Exception {
		init();
		launch("firefox");
		navigate("alert");
		driver.findElement(By.id("alertButton")).click();
		Alert simplealert = driver.switchTo( ).alert( );
		Thread.sleep(2000);
		simplealert.accept();
		
 
	}

}
