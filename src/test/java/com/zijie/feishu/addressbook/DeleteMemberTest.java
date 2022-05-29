package com.zijie.feishu.addressbook;

import com.zijie.feishu.page.AddressBookPage;
import com.zijie.feishu.page.MainPage;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DeleteMemberTest {
    @Test
    @Order(3)
    public void testDeleteMemberSubmit(){
        String account="13140151474";
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.toAddressBookPage();
        addressBookPage.searchMemberByKeyWord(account);
        addressBookPage.deleteMemberSubmit();
        String tipsText= addressBookPage.getTipsText();
        addressBookPage.quitBrowser();
        assertThat(tipsText,equalTo("É¾³ý³É¹¦"));
    }


    @Test
    @Order(1)
    public void testDeleteMemberCancle(){
        String name="annie";
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.toAddressBookPage();
        addressBookPage.searchMemberByKeyWord(name);
        addressBookPage.deleteMemberCancle();
        String text= addressBookPage.getaddMemberSearchTextByName();
        addressBookPage.quitBrowser();
        assertThat(text,containsString("annie"));
    }

    @Test
    @Order(2)
    public void testDeleteMemberCloseAlert(){
        String name="annie";
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.toAddressBookPage();
        addressBookPage.searchMemberByKeyWord(name);
        addressBookPage.deleteMemberCloseAlert();
        String text= addressBookPage.getaddMemberSearchTextByName();
//        addressBookPage.quitBrowser();
        assertThat(text,containsString("annie"));


    }

}
