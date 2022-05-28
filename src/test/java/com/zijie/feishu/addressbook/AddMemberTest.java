package com.zijie.feishu.addressbook;

import com.zijie.feishu.page.AddressBookPage;
import com.zijie.feishu.page.MainPage;
import com.zijie.feishu.utils.TimeStamp;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AddMemberTest {
    @Test
    void testAddMember(){
        String phoneNum= "13140151474";
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.addressBookPage();
        String toastText=addressBookPage.addMember(TimeStamp.getCurrentTimeStampForString(),phoneNum,phoneNum,phoneNum)
                .getTipsText();
        System.out.println(phoneNum);
        mainPage.quitBrowser();
        Assertions.assertEquals(toastText,"±£´æ³É¹¦");
    }
    @Test
    void tearDown(){
        String account="13140151474";
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.toAddressBookPage();
        addressBookPage.searchMemberByKeyWord(account);
        addressBookPage.deleteMemberSubmit();
        

    }


}
