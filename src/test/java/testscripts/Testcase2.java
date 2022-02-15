package testscripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.WebDriverDriverUtilites;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.Testingpage;

public class Testcase2 extends BaseClass {
	
	
	@Test
	public void tc2() throws IOException, InterruptedException {
		
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbtn();
		s.demoApp();
		
		SkillraryDemoApp d =new SkillraryDemoApp(driver);
		
		driverutilites.switchingTabs(driver);
		
		driverutilites.dropDown(d.getCoursedd(),pdata.getPropertyFiledata("testingbtn"));
		
		Testingpage t= new Testingpage(driver);
		driverutilites.dragdrop(driver,t.getMunit(),t.getCartarea());
		
		
		WebElement facebook = t.getFbicon();//storing icon location
		Point location = facebook.getLocation();//getting icon location
		int x = location.getX();//getting coordinates
		int y = location.getY();
		driverutilites.scrollBar(driver, x, y);//scrolling to the given coordinates
		
		t.facebookicon();
		
		
		Assert.assertEquals(driver.getTitle(),pdata.getPropertyFiledata("fbtitle"));
		
		}
	}
	
	
