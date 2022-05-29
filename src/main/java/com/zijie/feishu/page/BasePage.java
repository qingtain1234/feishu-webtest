package com.zijie.feishu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

    //清空输入框
    public void clearInput(By by){
        driver.findElement(by).clear();
    }

    //上传图片todo
    public void uploadPicture(String path) throws AWTException {
        StringSelection selection=new StringSelection("D:\\selenium.png");
        //把图文文件路径复制到剪贴板
        Toolkit .getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        System.out.println("selection"+selection);
        //新建Robot类
        Robot robot=new Robot();
//        //按下回车
//        robot.keyPress(KeyEvent.VK_ENTER);
//        //释放回车
//        robot.keyRelease(KeyEvent.VK_ENTER);

        //按下CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        //释放CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        //点击回车Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

}
