package com.github.siiilas.facebooklogin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookPage {

    private WebDriver driver;

    private FacebookPage() {
    }

    public static FacebookPage criar() {
        FacebookPage page = new FacebookPage();
        page.driver = new FirefoxDriver();
        return page;
    }

    public FacebookPage abrir() {
        driver.get("http://www.facebook.com.br");
        return this;
    }

    public FacebookPage usuario(String username) {
        WebElement usuario = driver.findElement(By.id("email"));
        usuario.sendKeys(username);
        return this;
    }

    public FacebookPage senha(char[] password) {
        WebElement senha = driver.findElement(By.id("pass"));
        senha.sendKeys(String.valueOf(password));
        return this;
    }

    public boolean logar() {
        WebElement form = driver.findElement(By.id("login_form"));
        form.submit();
        boolean logado = "Facebook".equals(driver.getTitle());
        driver.close();
        return logado;
    }

}
