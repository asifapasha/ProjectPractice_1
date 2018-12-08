package com.recipeapp;

import com.recipeapp.launch.BrowserLaunch;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class NewTest {

    WebDriver driver;

    private String getWebDriverPath(String driverType)
    {
        String driverpath = "";
        if(driverType.equalsIgnoreCase("chrome"))
        {
            ClassLoader classLoader = getClass().getClassLoader();
            driverpath = new File(classLoader.getResource("somefile").getFile()).getAbsolutePath();
            driver = new ChromeDriver();
        }

        return driverpath;
    }
    @Before
    public void setDriver() {
        System.out.println("From before test");
        System.setProperty("webdriver.chrome.driver", getWebDriverPath("chrome"));

    }

    @Test
    public void testLaunch() {
        System.out.println("This is test");
        BrowserLaunch browserLaunch = new BrowserLaunch(driver);
    }
}
