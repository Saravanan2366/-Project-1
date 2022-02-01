package org.test.page;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
	public LoginPage() {
	PageFactory.initElements(driver, this);
	

}
@FindBy(id="email")
private WebElement txtusername;

@FindBy(id="pass")
private WebElement password;

@FindBy(name="login")
private WebElement btnlogin;


public WebElement getTxtusername() {
	return txtusername;
}

public WebElement getPassword() {
	return password;
}

public WebElement getBtnlogin() {
	return btnlogin;
}	
}