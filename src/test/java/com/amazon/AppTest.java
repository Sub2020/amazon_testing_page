package com.amazon;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AppTest {

    private WebDriver driver;

    @Before

    public void setup(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\amazonTesting\\src\\Driver\\edge\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test

    public void testAmazontitle() {
        driver.get("https://www.amazon.com/");
        String title = driver.getTitle();
        System.out.println(title);
        assertTrue("Title shouls contain 'Amazon'", title.contains("Amazon"));
    }

    @After

    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
