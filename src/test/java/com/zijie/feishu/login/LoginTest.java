package com.zijie.feishu.login;

import com.zijie.feishu.page.LoginPage;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class LoginTest {
    /**
     * δ��¼ʱ��ɨ���¼����ȡcookie�󱣴�
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    void testLogin() throws IOException, InterruptedException {
        LoginPage loginPage=new LoginPage();
        loginPage.login();
    }

    /**
     * �ѵ�¼������ȡcookies.yaml�ļ��е�cookie��ӵ�driver�У�ˢ��ҳ��ʵ���Զ���¼
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    void testLogined() throws IOException, InterruptedException {
       LoginPage loginPage=new LoginPage();
       loginPage.logined();
    }


}
