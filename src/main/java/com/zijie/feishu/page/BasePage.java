package com.zijie.feishu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public BasePage(){
    }
    void click(By by){
        driver.findElement(by).click();
    }
    void sendKeys(By by,String content){
        driver.findElement(by).sendKeys(content);
    }
    void keyEnter(By by){
        driver.findElement(by).sendKeys(Keys.ENTER);

    }
    String getText(By by){
       String text=driver.findElement(by).getText();
       return text;
    }
    public void wait(ExpectedCondition expectedCondition,long time){
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(expectedCondition);
    }

}
