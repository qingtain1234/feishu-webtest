package com.zijie.feishu.login;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.zijie.feishu.page.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
