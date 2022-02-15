package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="last")
	private WebElement loginb;
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void usernmae(String username1) {
		username.sendKeys(username1);
	}
	public void password(String password1) {
		password.sendKeys(password1);	
	}
	public void loginbtn() {
		loginb.click();
	}
	
}
