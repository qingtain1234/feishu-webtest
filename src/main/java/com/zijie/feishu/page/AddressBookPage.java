package com.zijie.feishu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddressBookPage extends BasePage{
    public  AddressBookPage(WebDriver driver){
        super(driver);
    }
    public AddressBookPage addMember(String name,String acctid,String biz_mail,String mobile){
        sendKeys(By.name("username"),name);
        sendKeys(By.name("acctid"),acctid);
        sendKeys(By.name("biz_mail"),biz_mail);  
        sendKeys(By.name("mobile"),mobile);
        selectedRadio(By.cssSelector("input[value='2']"));
        click(By.cssSelector("div.member_edit>form>div:nth-of-type(3)>a:nth-of-type(2)"));
        return new AddressBookPage(driver);
    }

    public AddressBookPage searchMemberByKeyWord(String keyWord){
        sendKeys(By.id("memberSearchInput"),keyWord);
        keyEnter(By.id("memberSearchInput"));
        click(By.cssSelector("ul#search_member_list>li:nth-of-type(1)>a>span:nth-of-type(1)"));
        return  new AddressBookPage(driver);

    }

    public String getTipsText(){
        wait(ExpectedConditions.elementToBeClickable(By.id("js_tips")),20);
        String text=getText(By.id("js_tips"));
        return text;
    }

    public String getaddMemberSearchTextByName(){
        String text=getText(By.cssSelector(".member_display_cover_detail>div:nth-of-type(1)"));;
        return text;
    }
    public String getaddMemberSearchTextByAccount(){
        String text=getText(By.cssSelector(".member_display_cover_detail>div:nth-of-type(3)"));;
        return text;
    }

    public void deleteMemberSubmit(){
        click(By.cssSelector(".js_del_member"));
        click(By.cssSelector("a[d_ck='submit']"));
    }
    public void deleteMemberCancle(){
        click(By.cssSelector(".js_del_member"));
        click(By.cssSelector("a[d_ck='cancel']"));
    }

    public void deleteMemberCloseAlert(){
        click(By.cssSelector(".js_del_member"));
        click(By.cssSelector(".qui_dialog_close"));
    }


}
