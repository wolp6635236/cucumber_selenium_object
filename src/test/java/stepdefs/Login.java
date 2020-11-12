package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.testng.Assert;
import page.loginPage;

/**
 * @Author: liupeng
 * @Description:
 * @Date: Created in 16:50 2019/4/2
 * @Modified By:
 */
public class Login {
    private loginPage loginPage ;

    @当("^我打开网站URL \"([^\"]*)\"$")
    public void 我打开网站url(String arg1) throws Throwable {
        loginPage = new loginPage();
        loginPage.getUrl(arg1);
    }

    @那么("^进入登录页面$")
    public void 进入登录页面() throws Throwable {
        Assert.assertEquals("http://gonghang.test.cdecube.com/signin",loginPage.getLoginUrl());
    }

    @当("^我输入用户名为\"([^\"]*)\"$")
    public void 我输入用户名为(String arg1) throws Throwable {
        loginPage.inputUsername(arg1);
    }

    @当("^输入密码为\"([^\"]*)\"$")
    public void 输入密码为(String arg1) throws Throwable {
        loginPage.inputPassword(arg1);
        loginPage.clickLoginButton();
    }

    @那么("^我能看到URL变为\"([^\"]*)\"$")
    public void 我能看到url变为(String arg1) throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals(arg1,loginPage.getLoginUrl());
    }

    @那么("^可以看到\"([^\"]*)\"按钮$")
    public void 可以看到_按钮(String arg1) throws Throwable {
        Assert.assertEquals(loginPage.getLoginout(arg1),true);
    }

    @当("^点击登录按钮$")
    public void 点击登录按钮() throws Throwable {
        loginPage.clickLoginButton();
    }

    @那么("^我将看到验证失败的提示\"([^\"]*)\"用户名或密码错误\"([^\"]*)\"$")
    public void 我将看到验证失败的提示_用户名或密码错误(String arg1, String arg2) throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals("用户密码错误",loginPage.getErroMessage());
    }

    @那么("^我将看到验证失败的提示\"([^\"]*)\"请输入用户名\"([^\"]*)\"$")
    public void 我将看到验证失败的提示_请输入用户名(String arg1, String arg2) throws Throwable {
        Assert.assertEquals("请输入用户名",loginPage.getErroMessage());

    }

    @那么("^我将看到验证失败的提示\"([^\"]*)\"请输入密码\"([^\"]*)\"$")
    public void 我将看到验证失败的提示_请输入密码(String arg1, String arg2) throws Throwable {
        Assert.assertEquals("请输入密码",loginPage.getErroMessage());

    }
    @那么("^可以看到\"([^\"]*)\"标题$")
    public void 可以看到_标题(String arg1) throws Throwable {

        Assert.assertEquals(arg1,loginPage.getTitle());
    }

    @那么("^开始截图并保存$")
    public void 开始截图并保存() throws Throwable {
        loginPage.scrren();
    }
    @After
    public void f() {
        loginPage.close();
    }
    @那么("^退出浏览器$")
    public void 退出浏览器() throws Throwable {
        loginPage.close();
    }

}