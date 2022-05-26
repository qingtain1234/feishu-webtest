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
     * 未登录时，扫码登录，获取cookie后保存
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    void testLogin() throws IOException, InterruptedException {
        LoginPage loginPage=new LoginPage();
        loginPage.login();
    }

    /**
     * 已登录过，获取cookies.yaml文件中的cookie添加到driver中，刷新页面实现自动登录
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    void testLogined() throws IOException, InterruptedException {
       LoginPage loginPage=new LoginPage();
       loginPage.logined();
    }


}
