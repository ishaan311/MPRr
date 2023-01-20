package co.facpro.faculty;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class AddCP {
	fac_login ob = new fac_login();
	
	@BeforeClass
	public void ru()
	{
		ob.login();
	}
	
	@Test
	public void Conference_Proceedings()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Conference Proceedings");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("paperTitle")).sendKeys("testrahul1234");
			ob.obj.driver.findElement(By.id("organizer")).sendKeys("testrahul123");
			ob.obj.driver.findElement(By.id("title")).sendKeys("testrahul123");
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
		    
			WebElement web = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/h4"));	
			String st = web.getText();
			int n = st.length();
			char vl = st.charAt(n - 1);
			char vm = st.charAt(n - 2);
			String fl = "" + vm + vl;
			System.out.println(fl);

			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/div/div["+ fl +"]")).click();
			 
			 
			WebElement paperTitle1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2"));	
			WebElement organizer1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2/span"));	
			WebElement organizer2 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[2]/p[2]"));	
			WebElement isHardCopy = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[3]/p[2]"));	
			WebElement isPublished = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[4]/p[2]"));	
			WebElement publisher = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[5]/p[2]"));	
			WebElement isbn = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[6]/p[2]"));	
			WebElement pageno = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[7]/p[2]"));	
			WebElement regionType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[8]/p[2]"));	
			WebElement finType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[9]/p[2]"));	
			WebElement remarks = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[10]/p[2]"));	
			WebElement place = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div[1]/p[1]"));	
			WebElement date = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div[1]/p[2]"));	
			WebElement authors = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div[2]/p"));	
			
			
			String paperTitle = paperTitle1.getText().replace(" " + organizer1.getText(), "");
			String organizer = organizer1.getText().replace("(", "").replace(")" , "");
			SoftAssert sa = new SoftAssert();			
			sa.assertEquals(paperTitle,"testrahul1234","{PAPER TITLE MISMATCH}");
			sa.assertEquals(organizer,"testrahul123","{ORGANIZER MISMATCH}");
			sa.assertEquals(organizer2.getText(),"testrahul123","{ORGANIZER MISMATCH}");
			sa.assertEquals(isHardCopy.getText(),"Yes","{isHardCopy MISMATCH}");
			sa.assertEquals(isPublished.getText(),"Yes","{isPublished MISMATCH}");
			sa.assertEquals(publisher.getText(),"IV","{publisher MISMATCH}");
			sa.assertEquals(isbn.getText(),"12345677","{isbn MISMATCH}");
			sa.assertEquals(pageno.getText(),"23 - 30","{pageno range MISMATCH}");
			sa.assertEquals(place.getText(),"@JP","{place MISMATCH}");
			sa.assertEquals(date.getText(),"1/3/2000 - 1/3/20002","{date MISMATCH}");
			sa.assertEquals(authors.getText(),"— By IV JK RG","{authors MISMATCH}");
			sa.assertEquals(regionType.getText(),"National","{REGIONTYPE MISMATCH}");
			sa.assertEquals(finType.getText(),"College Sponsored","{FINTYPE MISMATCH}");
			sa.assertEquals(remarks.getText(),"abcdefghijklnmpsaofasopdaoias","{REMARK MISMATCH}");

			sa.assertAll();
	}
	@Test
	public void Books_Published()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Books Published");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("title")).sendKeys("testrahul123");
			ob.obj.driver.findElement(By.id("publisher")).sendKeys("testrahul123");
			ob.obj.driver.findElement(By.id("place")).sendKeys("testrahul123");
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
		    
		    WebElement web = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/h4"));	
			String st = web.getText();
			int n = st.length();
			char vl = st.charAt(n - 1);
			char vm = st.charAt(n - 2);
			String fl = "" + vm + vl;
			System.out.println(fl);

			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/div/div["+ fl +"]")).click();
			 
			 
			WebElement title1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2"));	
			WebElement publisher = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div[1]/p"));	
			WebElement place1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div[3]/p"));	
			WebElement isbn1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2/span"));	
			WebElement place2 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[1]/p[2]"));	
			WebElement isbn2 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[2]/p[2]"));	
			WebElement pubdate = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div[2]/p"));	
			WebElement pubCategory = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[3]/p[2]"));	
			WebElement isHardCopy = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[4]/p[2]"));	
			
			
			
			String title = title1.getText().replace(" " + isbn1.getText(), "");
			String isbn = isbn1.getText().replace("(", "").replace(")" , "");
			SoftAssert sa = new SoftAssert();			
			sa.assertEquals(title,"testrahul123","{TITLE MISMATCH}");
			sa.assertEquals(isbn,"23","{isbn1 MISMATCH}");
			sa.assertEquals(publisher.getText(),"— Publisher: testrahul123","{publisher MISMATCH}");
			sa.assertEquals(place1.getText(),"@testrahul123","{place1 MISMATCH}");
			sa.assertEquals(place2.getText(),"testrahul123","{place2 MISMATCH}");
			sa.assertEquals(isbn2.getText(),"23","{isbn2 MISMATCH}");
			sa.assertEquals(pubdate.getText(),"Published in - 01/2000","{pubdate MISMATCH}");
			sa.assertEquals(pubCategory.getText(),"National","{pubCategory MISMATCH}");
			sa.assertEquals(isHardCopy.getText(),"Yes","{isHardCopy MISMATCH}");

			sa.assertAll();
	}
	
	@Test
	public void Projects()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Projects");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("topic")).sendKeys("testrahul123");
			
			ob.obj.driver.findElement(By.id("fundingAgency")).sendKeys("testrahul123");
			
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
		    
		    WebElement web = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/h4"));	
			String st = web.getText();
			int n = st.length();
			char vl = st.charAt(n - 1);
			char vm = st.charAt(n - 2);
			String fl = "" + vm + vl;
			System.out.println(fl);

			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/div/div["+ fl +"]")).click();
			 
			 
			WebElement topic1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2"));	
			WebElement category1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2/span"));	
			WebElement date = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/span"));	
			WebElement status = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div/p"));	
			WebElement regionType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[1]/p[2]"));	
			WebElement fundingAgency = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[2]/p[2]"));	
			WebElement finType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[3]/p[2]"));	
			WebElement fundsAllocated = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[4]/p[2]"));		
			WebElement isHardCopy = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[5]/p[2]"));		
			WebElement remark = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[6]/p[2]"));	
				
			
			
			String topic = topic1.getText().replace(" " + category1.getText(), "");
			String category = category1.getText().replace("(", "").replace(")" , "");
			SoftAssert sa = new SoftAssert();			
			sa.assertEquals(topic,"testrahul123","{topic MISMATCH}");
			sa.assertEquals(category,"Minor Project","{category MISMATCH}");
			sa.assertEquals(date.getText(),"1/3/2000 - 1/3/20002","{date MISMATCH}");
			sa.assertEquals(status.getText(),"- Completed","{status MISMATCH}");
			sa.assertEquals(regionType.getText(),"National","{regionType MISMATCH}");
			sa.assertEquals(fundingAgency.getText(),"testrahul123","{fundingAgency MISMATCH}");
			sa.assertEquals(finType.getText(),"College Sponsored","{finType MISMATCH}");
			sa.assertEquals(fundsAllocated.getText(),"2000","{fundsAllocated MISMATCH}");
			sa.assertEquals(isHardCopy.getText(),"Yes","{isHardCopy MISMATCH}");
			sa.assertEquals(remark.getText(),"abcdefghijklnmpsaofasopdaoias","{remark MISMATCH}");

			sa.assertAll();
		    
	}
	
	
	@Test
	public void Organized_Seminars()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[5]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Organized Seminars");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("topic")).sendKeys("testrahul123");	
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
		    
		    WebElement web = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/h4"));	
			String st = web.getText();
			int n = st.length();
			char vl = st.charAt(n - 1);
			char vm = st.charAt(n - 2);
			String fl = "" + vm + vl;
			System.out.println(fl);

			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/div/div["+ fl +"]")).click();
			 
			 
			WebElement topic = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2"));	
			WebElement date = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/span"));	
			WebElement place = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div/p"));	
			WebElement regionType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[1]/p[2]"));	
			WebElement finType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[2]/p[2]"));	
			WebElement isHardCopy = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[3]/p[2]"));		
			WebElement remark = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[4]/p[2]"));	
		
			
			SoftAssert sa = new SoftAssert();			
			sa.assertEquals(topic.getText(),"testrahul123","{topic MISMATCH}");
			sa.assertEquals(date.getText(),"1/3/2000 - 1/3/20002","{date MISMATCH}");
			sa.assertEquals(place.getText(),"@Within MSI","{place MISMATCH}");
			sa.assertEquals(regionType.getText(),"National","{regionType MISMATCH}");
			sa.assertEquals(finType.getText(),"College Sponsored","{finType MISMATCH}");
			sa.assertEquals(isHardCopy.getText(),"Yes","{isHardCopy MISMATCH}");
			sa.assertEquals(remark.getText(),"abcdefghijklnmpsaofasopdaoias","{remark MISMATCH}");
			
			
			sa.assertAll();
	}

	@Test
	public void Journals()
	{
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[6]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Journals");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("paperTitle")).sendKeys("testrahul123");
			ob.obj.driver.findElement(By.id("spageno")).sendKeys("23");
			ob.obj.driver.findElement(By.id("epageno")).sendKeys("30");
			ob.obj.driver.findElement(By.id("jname")).sendKeys("testrahul123");
			ob.obj.driver.findElement(By.id("publisher")).sendKeys("IV");
			ob.obj.driver.findElement(By.id("volumeno")).sendKeys("2");			
			ob.obj.driver.findElement(By.id("issueno")).sendKeys("01032000");
			ob.obj.driver.findElement(By.id("pubmonth")).sendKeys("January");
			ob.obj.driver.findElement(By.id("pubmonth")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("pubyear")).sendKeys("2000");			
			ob.obj.driver.findElement(By.id("issn")).sendKeys("0120002");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);		
			ob.obj.driver.findElement(By.id("webUrl")).sendKeys("https://facpro-msi.web.app/faculty/dashboard");
			ob.obj.driver.findElement(By.id("indexedBy")).sendKeys(" ");
			ob.obj.driver.findElement(By.id("indexedBy")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("isUgcApproved")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isUgcApproved")).sendKeys(Keys.RETURN);		
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys("Yes");
			ob.obj.driver.findElement(By.id("isHardCopy")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			ob.obj.driver.findElement(By.id("load-btn")).click();
		    ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
		    
		    WebElement web = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/h4"));	
			String st = web.getText();
			int n = st.length();
			char vl = st.charAt(n - 1);
			char vm = st.charAt(n - 2);
			String fl = "" + vm + vl;
			System.out.println(fl);

			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/div/div["+ fl +"]")).click();
			 
			 
			WebElement paperTitle1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2"));	
			WebElement jname1 = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2/span"));	
			WebElement pageno = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div[1]/p"));	
			WebElement Publishedin = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/div/div[2]/p"));	
			WebElement publisher = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[1]/p[2]"));	
			WebElement volumeno = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[2]/p[2]"));	
			WebElement issueno = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[3]/p[2]"));	
			WebElement issn = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[4]/p[2]"));		
			WebElement regionType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[5]/p[2]"));		
			WebElement weburl = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[6]/a"));	
			WebElement indexedby = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[7]/p[2]"));		
			WebElement isUgcApproved = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[8]/p[2]"));		
			WebElement isHardCopy = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[9]/p[2]"));		

			
				
			
			
			String paperTitle = paperTitle1.getText().replace(" " + jname1.getText(), "");
			String jname = jname1.getText().replace("(", "").replace(")" , "");
			SoftAssert sa = new SoftAssert();			
			sa.assertEquals(paperTitle,"testrahul123","{topic MISMATCH}");
			sa.assertEquals(jname,"testrahul123","{category MISMATCH}");
			sa.assertEquals(pageno.getText(),"Page No. 23 - 30","{pageno MISMATCH}");
			sa.assertEquals(Publishedin.getText(),"Published in 1/2000","{Publishedin MISMATCH}");
			sa.assertEquals(publisher.getText(),"IV","{regionType MISMATCH}");
			sa.assertEquals(volumeno.getText(),"2","{volumeno MISMATCH}");
			sa.assertEquals(issueno.getText(),"01032000","{issueno MISMATCH}");
			sa.assertEquals(issn.getText(),"0120002","{issn MISMATCH}");
			sa.assertEquals(regionType.getText(),"National","{regionType MISMATCH}");
			sa.assertEquals(weburl.getAttribute("href"),"https://facpro-msi.web.app/faculty/dashboard","{weburl MISMATCH}");
			sa.assertEquals(indexedby.getText(),"Scopus","{indexedby MISMATCH}");
			sa.assertEquals(isUgcApproved.getText(),"Yes","{isUgcApproved MISMATCH}");
			sa.assertEquals(isHardCopy.getText(),"Yes","{isHardCopy MISMATCH}");

			

			sa.assertAll();
	}
	
	@Test
	public void Student_Activities()
	{
		
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[7]/button/a")).click();
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Student Activities");
			ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			ob.obj.driver.findElement(By.id("name")).sendKeys("Natiossasafnal");			
			ob.obj.driver.findElement(By.id("tCoordinators")).sendKeys("testrahul123");
			ob.obj.driver.findElement(By.id("sOrganizers")).sendKeys("123MSI");
			ob.obj.driver.findElement(By.id("startDate")).sendKeys("01/03/2000");
			ob.obj.driver.findElement(By.id("endDate")).sendKeys("01/03/20002");		
	        ob.obj.driver.findElement(By.id("type")).sendKeys("Intra College");
			ob.obj.driver.findElement(By.id("type")).sendKeys(Keys.RETURN);			
			ob.obj.driver.findElement(By.id("remarks")).sendKeys("abcdefghijklnmpsaofasopdaoias");
			ob.obj.driver.findElement(By.id("load-btn")).click();
		    ob.obj.driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[1]")).click();
		    
		    WebElement web = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/h4"));	
		 			String st = web.getText();
		 			int n = st.length();
		 			char vl = st.charAt(n - 1);
		 			char vm = st.charAt(n - 2);
		 			String fl = "" + vm + vl;
		 			System.out.println(fl);

		 			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/div/div["+ fl +"]")).click();
		 			 
		 			 
		 			WebElement name = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2"));	
		 			WebElement date = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/span"));	
		 			WebElement tCoordinators = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[1]/p[2]"));	
		 			WebElement sOrganizers = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[2]/p[2]"));	
		 			WebElement type = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[3]/p"));	
		 		
		 			
		 			SoftAssert sa = new SoftAssert();			
		 			sa.assertEquals(name.getText(),"Natiossasafnal","{name MISMATCH}");
		 			sa.assertEquals(date.getText(),"1/3/2000 - 1/3/2000","{date MISMATCH}");
		 			sa.assertEquals(tCoordinators.getText(),"testrahul123","{tCoordinators MISMATCH}");
		 			sa.assertEquals(sOrganizers.getText(),"123MSI","{sOrganizers MISMATCH}");
		 			sa.assertEquals(type.getText(),"Intra College","{type MISMATCH}");
		 			
		 			
		 			

		 			sa.assertAll();
	}
	
	@Test
	public void Attended_Events()
	{
	
		
			ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/button/a")).click();
			 ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys("Attended Events");
			 ob.obj.driver.findElement(By.id("achievementCategory")).sendKeys(Keys.RETURN);
			 ob.obj.driver.findElement(By.id("regionType")).sendKeys("National");
			 ob.obj.driver.findElement(By.id("regionType")).sendKeys(Keys.RETURN);
			 ob.obj.driver.findElement(By.id("topic")).sendKeys("Hackathon1245543");
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
		
			WebElement web = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/h4"));	
			String st = web.getText();
			int n = st.length();
			char vl = st.charAt(n - 1);
			char vm = st.charAt(n - 2);
			String fl = "" + vm + vl;
			System.out.println(fl);

			 ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[2]/div/div/div["+ fl +"]")).click();
			 
			 
			WebElement topic = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[1]/h2"));	
			WebElement eventType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[1]/p[2]"));	
			WebElement regionType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[2]/p[2]"));	
			WebElement finType = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[3]/p[2]"));	
			WebElement remarks = ob.obj.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/main/section[2]/div/div[4]/p[2]"));	
			SoftAssert sa = new SoftAssert();			
			sa.assertEquals(topic.getText(),"Hackathon1245543","{TOPIC MISMATCH}");
			sa.assertEquals(eventType.getText(),"FDP","{EVENTTYPE MISMATCH}");
			sa.assertEquals(regionType.getText(),"National","{REGIONTYPE MISMATCH}");
			sa.assertEquals(finType.getText(),"College Sponsored","{FINTYPE MISMATCH}");
			sa.assertEquals(remarks.getText(),"abcdefghijklnmpsaofasopdaoias","{REMARK MISMATCH}");

			System.out.println(topic.getText());
			System.out.println(eventType.getText());
			System.out.println(regionType.getText());
			System.out.println(finType.getText());
			System.out.println(remarks.getText());

			sa.assertAll();

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
