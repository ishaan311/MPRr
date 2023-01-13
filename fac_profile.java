package co.facpro.faculty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fac_profile {
	fac_login ob = new fac_login();
	@BeforeTest
	public void lg()
	{
			ob.login();
	}
	
	@BeforeMethod
	public void nav()
	{
		ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/a[2]")).click();

	}
   @Test
   public void analytic()
   {
		try {
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div[1]/button")).click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
   }
   @Test
	 public void editprofile()
	 {
	  
		ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div[2]/button[1]")).click();
		ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/main/form/div[1]/input")).clear();

		ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/main/form/div[1]/input")).sendKeys("Ishaan Verma");
		ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/main/form/div[3]/input")).sendKeys("8989898987");
		ob.obj.driver.findElement(By.id("department")).sendKeys("Department of Computer");
		ob.obj.driver.findElement(By.id("department")).sendKeys(Keys.RETURN);
		ob.obj.driver.findElement(By.id("shift")).sendKeys("N/A");
		ob.obj.driver.findElement(By.id("shift")).sendKeys(Keys.RETURN);
		ob.obj.driver.findElement(By.id("designation")).sendKeys("Professor");
		ob.obj.driver.findElement(By.id("designation")).sendKeys(Keys.RETURN);
		ob.obj.driver.findElement(By.id("ugdegree")).sendKeys("B.Com");
		ob.obj.driver.findElement(By.id("ugdegree")).sendKeys(Keys.RETURN);
		ob.obj.driver.findElement(By.id("pgdegree")).sendKeys("M.E.");
		ob.obj.driver.findElement(By.id("pgdegree")).sendKeys(Keys.RETURN);
		ob.obj.driver.findElement(By.id("doctorate")).sendKeys("Ph.D.");
		try {
			ob.obj.driver.findElement(By.id("doctorate")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			ob.obj.driver.findElement(By.id("doctorate")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		

		
		
	 }
}
