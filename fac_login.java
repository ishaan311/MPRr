package co.facpro.faculty;

import org.openqa.selenium.By;

public class fac_login {
	chrome_launch_codes obj = new chrome_launch_codes();
	public void login()
	{
		obj.launch();
		obj.driver.get("https://facpro-msi.web.app/login");
		obj.driver.findElement(By.id("email")).sendKeys("ishaan03814902020@msijanakpuri.com");
		obj.driver.findElement(By.id("password")).sendKeys("MSI@1zw41r");
		obj.driver.findElement(By.id("load-btn")).click();
	}
	
	public void login(String email, String pass)
	{
		obj.launch();
		obj.driver.get("https://facpro-msi.web.app/login");
		obj.driver.findElement(By.id("email")).sendKeys(email);
		obj.driver.findElement(By.id("password")).sendKeys(pass);
		obj.driver.findElement(By.id("load-btn")).click();
	}
	
	public void adlogin()
	{
		obj.launch();
		obj.driver.get("https://facpro-msi.web.app/login");
		obj.driver.findElement(By.className("login_as")).click();
		obj.driver.findElement(By.id("email")).clear();
		obj. driver.findElement(By.id("email")).sendKeys("tester323@msijanakpuri.com");
		obj.driver.findElement(By.id("password")).sendKeys("Tester@2022_msiJanakPuri");
		obj.driver.findElement(By.id("load-btn")).click();
	}
	
	public void adlogin(String email, String pass)
	{
		obj.launch();
		obj.driver.get("https://facpro-msi.web.app/login");
		obj.driver.findElement(By.className("login_as")).click();
		obj.driver.findElement(By.id("email")).clear();
		obj. driver.findElement(By.id("email")).sendKeys(email);
		obj.driver.findElement(By.id("password")).sendKeys(pass);
		obj.driver.findElement(By.id("load-btn")).click();
	}
	
	
}
