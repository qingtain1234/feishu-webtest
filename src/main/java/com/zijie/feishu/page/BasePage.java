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

    //����-����
    public void alertAccept(){
        driver.switchTo().alert().accept();
    }

    //����-ȡ��
    public void alertCancel(){
        driver.switchTo().alert().dismiss();
    }

    //��������
    public void clearInput(By by){
        driver.findElement(by).clear();
    }

    //�ϴ�ͼƬtodo
    public void uploadPicture(String path) throws AWTException {
        StringSelection selection=new StringSelection("D:\\selenium.png");
        //��ͼ���ļ�·�����Ƶ�������
        Toolkit .getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        System.out.println("selection"+selection);
        //�½�Robot��
        Robot robot=new Robot();
//        //���»س�
//        robot.keyPress(KeyEvent.VK_ENTER);
//        //�ͷŻس�
//        robot.keyRelease(KeyEvent.VK_ENTER);

        //����CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        //�ͷ�CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        //����س�Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

}
