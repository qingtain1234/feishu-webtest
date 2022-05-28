package com.zijie.feishu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void selectedRadio(By by){
       WebElement element=driver.findElement(by);
       if(!element.isSelected()){
          click(by);
       }
    }
    public void wait(ExpectedCondition expectedCondition,long time){
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(expectedCondition);
    }

    public void quitBrowser(){
        driver.quit();
    }

    //弹窗-接受
    public void alertAccept(){
        driver.switchTo().alert().accept();
    }

    //弹窗-取消
    public void alertCancel(){
        driver.switchTo().alert().dismiss();
    }

}
