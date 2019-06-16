package com.ovi.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHelper {
   public static WebDriver driver;
    public static void setup() {
        try {
            System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
