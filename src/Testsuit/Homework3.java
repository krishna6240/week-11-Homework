package Testsuit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Homework3 extends BaseClass {
    @Before
    public void start() {
        String baseUrl = "http://automationpractice.com/index.php";
        openBrowser(baseUrl);
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }
    @Test
    public void signIN(){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@yahoo.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("fcr");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();



    }

}
