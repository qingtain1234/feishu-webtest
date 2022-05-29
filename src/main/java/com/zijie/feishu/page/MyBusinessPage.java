package com.zijie.feishu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyBusinessPage extends BasePage{
    public MyBusinessPage(WebDriver driver){
        super(driver);
    }
     public String getEnterpriseName(){
         String text=getText(By.cssSelector(".profile_enterprise_item_shareName"));
         return text;

     }

}
