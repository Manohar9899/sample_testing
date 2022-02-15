package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaforseleniunPage;
import pomPages.LearnjavaPage;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchbar(pdata.getPropertyFiledata("coursename"));
		s.searchicon();
		
		CorejavaforseleniunPage c= new CorejavaforseleniunPage(driver);
		c.corejavaselenium();
		
		LearnjavaPage l= new LearnjavaPage(driver);
		driverutilites.switchframe(driver);
		l.playbutton();
		l.pausebutton();
		driverutilites.switchbackframe(driver);
		l.twitterbtn(); 
		
		
		driverutilites.switchingTabs(driver);
		
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),pdata.getPropertyFiledata("twittertitle"));
	}

}



