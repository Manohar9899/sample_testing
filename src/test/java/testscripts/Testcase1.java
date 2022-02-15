package testscripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass
{
	@Test 
	public void tc1()
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbtn();
		s.demoApp();
		
		SkillraryDemoApp d= new SkillraryDemoApp(driver);
		driverutilites.switchingTabs(driver);;
		driverutilites.mouseHover(driver,d.getCoursetab());
		d.seleniumtrainingtab();
		
		AddtocartPage ad =new AddtocartPage(driver);
		driverutilites.doubleClick(driver,ad.getAdd());
		
		ad.addtocartbutton();
	
		driverutilites.alertPopup(driver);
		
	}
	

}
