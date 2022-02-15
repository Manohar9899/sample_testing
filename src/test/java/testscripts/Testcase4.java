package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.LoginPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase4 extends BaseClass{
	
	@Test
	public void tc4() throws IOException, InterruptedException {
		SkillraryLoginPage s =new SkillraryLoginPage(driver);
		s.gearsbtn();
		s.demoApp();
		
		SkillraryDemoApp d= new SkillraryDemoApp(driver);
		driverutilites.switchingTabs(driver);	
		d.loginb();
		
		LoginPage l=new LoginPage(driver);
		Thread.sleep(3000);
		l.usernmae(pdata.getPropertyFiledata("username"));
		Thread.sleep(3000);
		l.password(pdata.getPropertyFiledata("password"));
		Thread.sleep(3000);
		
		l.loginbtn();
		
		Assert.assertEquals(driver.getTitle(),pdata.getPropertyFiledata("coursestle"));
		
		
	}
}
