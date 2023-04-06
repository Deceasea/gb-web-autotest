package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class NegativeAuthorization extends AbstractClass {
    @Test
    @Order(1)
    void negativeLoginTest() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")), "")
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")), "c4b213d341");
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[3]/button/div")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
        Assertions.assertTrue(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/div/div/div[2]/p[1]")
                ), "Invalid credentials.").apply(getDriver())
        );
    }

    @Test
    @Order(2)
    void negativeLogin2symbolsTest() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")), "ab")
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")), "c4b213d341");
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[3]/button/div")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
        Assertions.assertTrue(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/div/div/div[2]/p[1]")
                ), "Invalid credentials.").apply(getDriver())
        );
    }

    @Test
    @Order(3)
    void negativeLogin25symbolsTest() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")), "qwertyuiopasdfghjklzxcvbn")
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")), "c4b213d341");
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[3]/button/div")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
        Assertions.assertTrue(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/div/div/div[2]/p[1]")
                ), "Invalid credentials.").apply(getDriver())
        );
    }

    @Test
    @Order(4)
    void negativeLoginSpecSymbolsTest() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")), "@#$%^&*(")
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")), "c4b213d341");
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[3]/button/div")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
        Assertions.assertTrue(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/div/div/div[2]/p[1]")
                ), "Invalid credentials.").apply(getDriver())
        );
    }
}
