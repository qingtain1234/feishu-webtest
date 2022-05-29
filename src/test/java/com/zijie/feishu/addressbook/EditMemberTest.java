package com.zijie.feishu.addressbook;

import com.zijie.feishu.page.AddressBookPage;
import com.zijie.feishu.page.MainPage;
import com.zijie.feishu.utils.TimeStamp;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class EditMemberTest {
    @Test
    public void testEdit(){
        String englishNameExc= TimeStamp.getCurrentTimeStampForString();
        MainPage mainPage=new MainPage();
        AddressBookPage addressBookPage=mainPage.toAddressBookPage();
        addressBookPage.searchMemberByKeyWord("annie");
        addressBookPage.editMember(englishNameExc);
        String englishNameAct=addressBookPage.getaddMemberSearchTextByEnglishName();
        System.out.println(englishNameExc+"****"+englishNameAct);
        addressBookPage.quitBrowser();
        assertThat(englishNameAct,containsString(englishNameExc));

    }
}
