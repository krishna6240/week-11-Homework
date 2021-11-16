package Testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class homework2 extends BaseClass{
    @Before
    public void start() {
        String baseUrl = "https://demo.nopcommerce.com/";
        openBrowser(baseUrl);
       /* driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        WebElement one = driver.findElement(By.xpath("//input[@name='q']"));
        one.sendKeys("demo nopCommerce store", Keys.ENTER);*/
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    }
    @Test
    public void Register(){
        driver.findElement(By.xpath("//input[@id='gender-male' or @id='gender-female']")).click();
        driver.findElement((By.xpath("//input[@id='FirstName']"))).sendKeys("krishna");
        driver.findElement((By.xpath("//input[@id='LastName']"))).sendKeys("Patel");
        driver.findElement((By.xpath("//select[@name='DateOfBirthDay']"))).sendKeys("18");
        driver.findElement((By.xpath("//select[@name='DateOfBirthMonth']"))).sendKeys("March");
        driver.findElement((By.xpath("//select[@name='DateOfBirthYear']"))).sendKeys("1991");
        driver.findElement((By.xpath("//input[@name='Email']"))).sendKeys("abcd@yahoo.com");
        driver.findElement((By.xpath("//input[@id='Company']"))).sendKeys("JIRA");
        driver.findElement((By.xpath("//input[@id='Newsletter']"))).click();
        driver.findElement((By.xpath("//input[@id='Password']"))).sendKeys("admin123");
        driver.findElement((By.xpath("//input[@id='ConfirmPassword']"))).sendKeys("admin123");
        driver.findElement((By.xpath("//button[@id='register-button']"))).click();
        String expectedMessage = "Your registration completed";

        WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualmessage = message.getText();

        Assert.assertEquals("Your registration completed",expectedMessage, actualmessage);
        System.out.println(message.getText());




    }
    @After
    public void finished(){

    }

}
