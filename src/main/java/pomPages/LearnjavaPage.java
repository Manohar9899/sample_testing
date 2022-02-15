package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnjavaPage {

	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	private WebElement twitter;
	
	public LearnjavaPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	}
	
	public void playbutton() {
		play.click();
	}
	public void pausebutton() {
		pause.click();
	}
	public void twitterbtn() {
		twitter.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
