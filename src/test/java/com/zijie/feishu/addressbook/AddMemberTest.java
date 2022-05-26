package com.zijie.feishu.addressbook;

import com.zijie.feishu.page.AddressBookPage;
import com.zijie.feishu.page.MainPage;
import com.zijie.feishu.utils.PhoneNum;
import com.zijie.feishu.utils.TimeStamp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AddMemberTest {
    @Test
    void testAddMember(){
        String phoneNum= PhoneNum.getPhoneNum();
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.addressBookPage();
        String toastText=addressBookPage.addressBookPage(TimeStamp.getCurrentTimeStampForString(),phoneNum,phoneNum,phoneNum)
                .getText();
        Assertions.assertEquals(toastText,"±£´æ³É¹¦");
    }


}
