package co.facpro.faculty;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_launch_codes {
	WebDriver driver;
	
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/selenium/chromedriver");

		
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));	
	}



public static void main(String[] args) {
	chrome_launch_codes obj = new chrome_launch_codes();
	obj.launch();
	obj.driver.quit();
	obj.driver = new ChromeDriver();
	
}

}