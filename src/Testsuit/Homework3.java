package Testsuit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework3 extends BaseClass {
    @Before
    public void start() {
        String baseUrl = "http://automationpractice.com/index.php";
        openBrowser(baseUrl);
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }
    @Test
    public void signIN(){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@yahoo.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("fcr");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        String expectedMessage = "There is 1 error";

        WebElement message = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String actualmessage = message.getText();

        Assert.assertEquals("There is 1 error",expectedMessage, actualmessage);
        System.out.println(message.getText());




    }

}
