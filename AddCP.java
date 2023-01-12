package co.facpro.faculty;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddCP {
	fac_login ob = new fac_login();
	
	@BeforeClass
	public void ru()
	{
		ob.login();
	}
	
	@Test
	public void run()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Conference Proceedings");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("paperTitle")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("organizer")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("title")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("spageno")).sendKeys("23");
			ob.obj.driver.findElement(By.id("epageno")).sendKeys("30");
			ob.obj.driver.findElement(By.id("startDate")).sendKeys("01/03/2000");
			ob.obj.driver.findElement(By.id("endDate")).sendKeys("01/03/20002");
			ob.obj.driver.findElement(By.id("isbn")).sendKeys("12345677");
			ob.obj.driver.findElement(By.id("place")).sendKeys("JP");
			ob.obj.driver.findElement(By.id("isPublished")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isPublished")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("publisher")).sendKeys("IV");
			ob.obj.driver.findElement(By.id("finType")).sendKeys("College Sponsored");
			
			ob.obj.driver.findElement(By.id("finType")).sendKeys(Keys.RETURN);
			
			ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("authors")).sendKeys("IV JK RG");
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			ob.obj.driver.findElement(By.id("load-btn")).click();
		    ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
	}
	@Test
	public void run1()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Books Published");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("title")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("publisher")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("place")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("isbn")).sendKeys("23");
			ob.obj.driver.findElement(By.id("pubmonth")).sendKeys("January");
			ob.obj.driver.findElement(By.id("pubmonth")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("pubyear")).sendKeys("2000");
			ob.obj.driver.findElement(By.id("pubCategory")).sendKeys("National");
			ob.obj.driver.findElement(By.id("pubCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			ob.obj.driver.findElement(By.id("load-btn")).click();
		    ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
	}
	
	@Test
	public void run2()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Projects");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("topic")).sendKeys("test123");
			
			ob.obj.driver.findElement(By.id("fundingAgency")).sendKeys("test123");
			
			ob.obj.driver.findElement(By.id("category")).sendKeys("Minor");
			ob.obj.driver.findElement(By.id("category")).sendKeys(Keys.RETURN);

	        ob.obj.driver.findElement(By.id("finType")).sendKeys("College Sponsored");
			ob.obj.driver.findElement(By.id("finType")).sendKeys(Keys.RETURN);
			
			ob.obj.driver.findElement(By.id("startDate")).sendKeys("01/03/2000");
			ob.obj.driver.findElement(By.id("endDate")).sendKeys("01/03/20002");
			
			ob.obj.driver.findElement(By.id("fundsAllocated")).sendKeys("2000");
			
			ob.obj.driver.findElement(By.id("status")).sendKeys("Completed");
			ob.obj.driver.findElement(By.id("status")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			ob.obj.driver.findElement(By.id("load-btn")).click();
		    ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
	}
	
	
	@Test
	public void run3()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[5]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Organized Seminars");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("topic")).sendKeys("test123");
			
			ob.obj.driver.findElement(By.id("place")).sendKeys("Within MSI");
			ob.obj.driver.findElement(By.id("place")).sendKeys(Keys.RETURN);

	        ob.obj.driver.findElement(By.id("finType")).sendKeys("College Sponsored");
			ob.obj.driver.findElement(By.id("finType")).sendKeys(Keys.RETURN);
			
			ob.obj.driver.findElement(By.id("startDate")).sendKeys("01/03/2000");
			ob.obj.driver.findElement(By.id("endDate")).sendKeys("01/03/20002");
			
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			ob.obj.driver.findElement(By.id("load-btn")).click();
		    ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
	}

	@Test
	public void run4()
	{
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[6]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Journals");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("paperTitle")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("spageno")).sendKeys("23");
			ob.obj.driver.findElement(By.id("epageno")).sendKeys("30");
			ob.obj.driver.findElement(By.id("jname")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("publisher")).sendKeys("IV");

			ob.obj.driver.findElement(By.id("volumeno")).sendKeys("test123");
			
			ob.obj.driver.findElement(By.id("issueno")).sendKeys("01032000");

			ob.obj.driver.findElement(By.id("pubmonth")).sendKeys("January");
			ob.obj.driver.findElement(By.id("pubmonth")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("pubyear")).sendKeys("2000");

			
			ob.obj.driver.findElement(By.id("issn")).sendKeys("0120002");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);
			
			
			ob.obj.driver.findElement(By.id("webUrl")).sendKeys("https://facpro-msi.web.app/faculty/dashboard");
			ob.obj.driver.findElement(By.id("indexedBy")).sendKeys("SCI");
			ob.obj.driver.findElement(By.id("indexedBy")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("isUgcApproved")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isUgcApproved")).sendKeys(Keys.RETURN);
		
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			ob.obj.driver.findElement(By.id("load-btn")).click();
		    ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
	}
	
	@Test
	public void run5()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[7]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Student Activities");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("name")).sendKeys("Natiossasafnal");
			
			ob.obj.driver.findElement(By.id("tCoordinators")).sendKeys("test123");
			ob.obj.driver.findElement(By.id("sOrganizers")).sendKeys("123MSI");
			ob.obj.driver.findElement(By.id("startDate")).sendKeys("01/03/2000");
			ob.obj.driver.findElement(By.id("endDate")).sendKeys("01/03/20002");
			
	        ob.obj.driver.findElement(By.id("type")).sendKeys("Intra College");
			ob.obj.driver.findElement(By.id("type")).sendKeys(Keys.RETURN);
			
			ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			ob.obj.driver.findElement(By.id("load-btn")).click();
		    ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
	}
	
	@Test
	public void run6()
	{
	
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/button/a")).click();
			 ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Attended Events");
			 ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			 ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			 ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);
			 ob.obj.driver.findElement(By.id("topic")).sendKeys("Hackathon");
			 ob.obj.driver.findElement(By.id("place")).sendKeys("Maharaja Surajmal Institute");
			 ob.obj.driver.findElement(By.id("eventType")).sendKeys("FDP");
			 ob.obj.driver.findElement(By.id("eventType")).sendKeys(Keys.RETURN);
			 ob.obj.driver.findElement(By.id("finType")).sendKeys("College Sponsored");
			 ob.obj.driver.findElement(By.id("finType")).sendKeys(Keys.RETURN);
			 ob.obj.driver.findElement(By.id("startDate")).sendKeys("01-12-2022");
			 ob.obj.driver.findElement(By.id("endDate")).sendKeys("06-12-2022");			
			 ob.obj.driver.findElement(By.id("duration")).sendKeys("10");
			 ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			 ob.obj.driver.findElement(By.id("load-btn")).click();
			 ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
//			 ob.obj.driver.navigate().to("https://facpro-msi.web.app/faculty/achievements/AE/631");
			 
//			WebElement web = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[2]/p[2]"));	
			 

	}

	@AfterMethod
	public void gh()
	{
		try {
			Thread.sleep(5000);
			ob.obj.driver.navigate().to("https://facpro-msi.web.app/faculty/dashboard");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
