package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    @BeforeClass
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://www.tzabar.co.il/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void nofeshBaArets(){
driver.findElement(By.cssSelector(".site-header.mobileHidden li:nth-child(1) .mobileHidden")).click();
driver.findElement(By.id("linkVal_3")).click();
driver.findElement(By.cssSelector("span.selectBg.selectBgDest.dest")).click();
driver.findElement(By.cssSelector("span.selectBg.selectBgDest.dest div.ffSelectMenuMidBG")).click();
driver.findElement(By.cssSelector("span.selectBg.selectBgDest.dest div.ffSelectMenuMidBG")).click();
driver.findElement(By.xpath("//*[@id='Div10']")).click();
    }

    @AfterTest (enabled = true)
    public void quit(){
        driver.close();
    }

}
