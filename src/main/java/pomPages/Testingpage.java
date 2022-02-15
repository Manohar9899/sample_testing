package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	
	
	@FindBy(xpath="(//a[text()='munit testing '])[2]")
	private WebElement munit;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbicon;
	
	public Testingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMunit() {
		return munit;
	}

	public WebElement getCartarea() {
		return cartarea;
	}
	
	public void facebookicon() {
		
		fbicon.click();
	}

	public WebElement getFbicon() {
		return fbicon;
	}
	
	
	

}
