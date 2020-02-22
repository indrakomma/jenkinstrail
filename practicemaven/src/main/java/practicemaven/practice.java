package practicemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice {
	
	@Test
	public static void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Lenovo//Desktop//javaproject//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//p[contains(text(),'Operator / Franchisee')]")).click();
	    Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		
	}

}
