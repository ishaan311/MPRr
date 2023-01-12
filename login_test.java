package co.facpro.faculty;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login_test {

	chrome_launch_codes obj = new chrome_launch_codes();

	@BeforeClass
	public void openbrowser() {
	obj.launch();
	}

	@Test
	public void tt()
	{
		System.out.println("test");
		
		
	}
}
