package page;

import com.cdecube.common.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author: liupeng
 * @Description:
 * @Date: Created in 14:45 2019/2/13
 * @Modified By:
 */
public class loginPage {
    WebDriver driver;
    public void setup() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/browserdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void getUrl(String args1) {
        this.setup();
        driver.get(args1);
    }
    public String getLoginUrl() {
        String geturl = driver.getCurrentUrl();
        return geturl;
    }
    public String getTitle() {
        String gettitle = driver.findElement(By.xpath("(//div[@class=\"title\"])[1]")).getText();
        return gettitle;
    }
    public void inputUsername(String arg1) {
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(arg1);
    }
    public void inputPassword(String arg1) {
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(arg1);
    }
    public void clickLoginButton() {
        driver.findElement(By.xpath("//button")).click();
    }
    public boolean getLoginout(String arg1) {
        String a;
        a = driver.findElement(By.xpath("//span[@class=\"logout__1zHYTpZ\"]")).getText();
        if (a.equals(arg1)){
            return true;
        }else {
            return false;
        }
    }
    public String getErroMessage() {
        String erromessage;
        erromessage = driver.findElement(By.xpath("//div[@class='error-box']")).getText();
        return erromessage;
    }
    public void close() {
        driver.close();
    }
    public void scrren() {
        ScreenShot screenShot = new ScreenShot(driver);
        screenShot.takeScreenshot("com.lp","screen");
    }
}