package launch;

import org.openqa.selenium.By;

public class Windowhandler extends BasicTest{

	public static void main(String[] args) throws Exception {
	init();
	launch("chrome");
	navigate("spicejet");
    
	driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-13awgt0.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-13qz1uu.r-1g40b8q:nth-child(2) div.css-1dbjc4n.r-184aecr.r-18u37iz.r-1777fci.r-1w50u8q.r-184en5c:nth-child(1) div.css-1dbjc4n.r-1awozwy.r-1kihuf0.r-18u37iz.r-1wtj0ep.r-dwc677.r-13qz1uu div.css-1dbjc4n.r-kgf08f.r-18u37iz:nth-child(2) a:nth-child(11) div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1mf7evn > div.css-76zvg2.r-jwli3a.r-ubezar.r-16dba41.r-1pzd9i8")).click();
	
	Object[] window = driver.getWindowHandles().toArray();
    driver.switchTo().window(window[1].toString());
    driver.findElement(By.id("ctl00_mainContent_ddlCashlessOrigin")).sendKeys("Gaya(GAY)");
    driver.switchTo().window(window[0].toString());
    driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]")).click();

	}
}