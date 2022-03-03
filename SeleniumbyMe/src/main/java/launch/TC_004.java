package launch;

import org.openqa.selenium.By;

public class TC_004 extends BasicTest {

	public static void main(String[] args) throws Exception {
		init();
		launch("chrome");
		navigate("google");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("selenium");
        Thread.sleep(2000);
        String str = driver.findElement(By.className("UUbT9")).getText(); 
        System.out.println(str);
        String[] s = str.split("\n");
        for(int i=0;i<s.length;i++) {
        	if(s[i].equalsIgnoreCase("selenium webdriver")) {
   driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).clear();
   driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(s[i]);
        	} 
        		
        }
        Thread.sleep(2000);
        driver.findElement(By.className("gNO89b")).click();;
        driver.close();
	}

}
