package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {

	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement login;

	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining; 
	
	public SkillraryDemoApp(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	}
	public WebElement getCoursetab() {
		return coursetab;
	}
	public WebElement getCoursedd() {
		return coursedd;
	}
	public void seleniumtrainingtab() {
		seleniumtraining.click(); 
	}
	public void loginb() {
		login.click();
	}
}
 