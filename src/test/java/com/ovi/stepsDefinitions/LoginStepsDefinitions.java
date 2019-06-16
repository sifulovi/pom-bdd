package com.ovi.stepsDefinitions;


import com.ovi.helper.BrowserHelper;
import com.ovi.pageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Map;

public class LoginStepsDefinitions extends BrowserHelper {

    LoginPage loginPage;


    @Given("^navigate to login page$")
    public void navigate_to_login_page(Map<String, String> data) throws Throwable {
        loginPage = new LoginPage(driver);
        loginPage.browseURL(data.get("url"));
    }

    @Given("^fill up authentication credential and submit:$")
    public void fill_up_authentication_credential_and_submit(Map<String, String> data) throws Throwable {
        loginPage.fillUpAdminLoginInfo(data.get("email"), data.get("password"));
    }

    @Then("validate authentication$")
    public void checking_authentication() throws Throwable {

    }
}
