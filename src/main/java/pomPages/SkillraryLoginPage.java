package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoApp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void gearsbtn() {
		gearsbtn.click();
	}
	public void demoApp() {
		demoApp.click();
	}
	public void searchbar(String name) {
		searchtb.sendKeys(name);
	}
	
	public void searchicon() {
		searchbtn.click();
	}
	
	
	
	
	
}
