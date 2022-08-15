package org.romanovYevgen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//клас сторінки авторизації з елементами які будуть використовуватись у тестах
public class LoginPage {
    WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By uName = By.name("username");
    By pswd = By.name("password");
    By loginBtn = By.xpath("//*[@id=\"all\"]/div/form/div[3]/input");

    public void enterUsername(String user) {
        driver.findElement(uName).sendKeys(user);
    }

    public void enterPassword(String password) {
        driver.findElement(pswd).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

}
