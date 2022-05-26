package com.zijie.feishu.page;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class LoginPage  extends BasePage{
    String url="https://work.weixin.qq.com/wework_admin/loginpage_wx";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage(){
    }
    public void login() throws IOException, InterruptedException {
       driver.get(url);
       Thread.sleep(15000);
       Set<Cookie> cookies=driver.manage().getCookies();
       ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
       mapper.writeValue(new File("cookies.yaml"),cookies);
   }
   public void logined() throws IOException {
       driver.get(url);
       ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
       TypeReference typeReference=new TypeReference<List<HashMap<String,Object>>>(){};
       List<HashMap<String,Object>> cookies=mapper.readValue(new File("cookies.yaml"),typeReference);
//       System.out.println(cookies);
       cookies.forEach(cookieMap->{
           driver.manage().addCookie(new Cookie(cookieMap.get("name").toString(),cookieMap.get("value").toString()));
       });
       driver.navigate().refresh();

   }

}
