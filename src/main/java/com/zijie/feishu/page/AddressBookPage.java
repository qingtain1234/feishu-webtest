package com.zijie.feishu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddressBookPage extends BasePage{
    public  AddressBookPage(WebDriver driver){
        super(driver);
    }
    public AddressBookPage addressBookPage(String name,String acctid,String biz_mail,String mobile){
        sendKeys(By.name("username"),name);
        sendKeys(By.name("acctid"),acctid);
        sendKeys(By.name("biz_mail"),biz_mail);  
        sendKeys(By.name("mobile"),mobile);
        click(By.cssSelector("div.member_edit>form>div:nth-of-type(3)>a:nth-of-type(2)"));
        return new AddressBookPage(driver);
    }
    public String getText(){
        wait(ExpectedConditions.elementToBeClickable(By.id("js_tips")),20);
        String text=getText(By.id("js_tips"));
        return text;
    }


}
