package org.romanovYevgen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//            //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
//            WebDriver driver = new ChromeDriver();
//
//            driver.manage().window().maximize();
//
//            driver.get("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php");
//        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//            //driver.close();

        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php");
            LoginPage login = new LoginPage(driver);
            login.enterUsername("YevgenRomanov");
            login.enterPassword("123456789_Y");
            login.clickLogin();
            //driver.quit();
        }
    }


