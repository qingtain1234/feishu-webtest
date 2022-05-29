package com.zijie.feishu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {
    LoginPage loginPage;
    File file = new File("cookies.yaml");

    public MainPage() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        if (!file.exists()) {
            try {
                loginPage.login();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                loginPage.logined();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public AddressBookPage addressBookPage() {
        wait(ExpectedConditions.elementToBeClickable(By.cssSelector("a[node-type='addmember']")), 60);
        click(By.cssSelector("a[node-type='addmember']"));
        return new AddressBookPage(driver);

    }

    public AddressBookPage toAddressBookPage() {
        wait(ExpectedConditions.elementToBeClickable(By.id("menu_contacts")), 60);
        click(By.id("menu_contacts"));
        return new AddressBookPage(driver);
    }
    public MyBusinessPage myBusinessPage(){
        wait(ExpectedConditions.elementToBeClickable(By.id("menu_profile")),60);
        click(By.id("menu_profile"));
        return new MyBusinessPage(driver);

    }

}
