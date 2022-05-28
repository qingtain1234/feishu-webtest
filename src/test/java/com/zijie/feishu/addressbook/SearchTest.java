package com.zijie.feishu.addressbook;

import com.zijie.feishu.page.AddressBookPage;
import com.zijie.feishu.page.MainPage;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class SearchTest {
    @Test
    public void testSearchMemberByAccount(){
        String phoneNum="13140151475";
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.toAddressBookPage();
        addressBookPage.searchMemberByKeyWord(phoneNum);
        String text= addressBookPage.getaddMemberSearchTextByAccount();
        mainPage.quitBrowser();
        assertThat(text,containsString(phoneNum));

    }
    @Test
    public void testSearchMemberByName(){
        String name="annie";
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.toAddressBookPage();
        addressBookPage.searchMemberByKeyWord(name);
        String text= addressBookPage.getaddMemberSearchTextByName();
        mainPage.quitBrowser();
        assertThat(text,containsString(name));

    }

}
