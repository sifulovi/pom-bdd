package com.ovi.pageObjects;

import com.ovi.helper.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BrowserHelper {


    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "email")
    WebElement emailField;

    @FindBy(how = How.NAME, using = "password")
    WebElement passwordField;

    @FindBy(how = How.CLASS_NAME, using = "login-button")
    WebElement loginButton;

    public void browseURL(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void fillUpAdminLoginInfo(String username, String password) {
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }


}


