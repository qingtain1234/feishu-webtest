package com.zijie.feishu.mybusiness;

import com.zijie.feishu.page.MainPage;
import com.zijie.feishu.page.MyBusinessPage;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class GetEnterpriseNameTest {
    @Test
    public void testGetEnterpriseName(){
        MainPage mainPage=new MainPage();
        MyBusinessPage myBusinessPage=mainPage.myBusinessPage();
        String actText=myBusinessPage.getEnterpriseName();
        myBusinessPage.quitBrowser();
        assertThat(actText,containsString("“¸’Ï≤‚ ‘’À∫≈"));
    }
}
