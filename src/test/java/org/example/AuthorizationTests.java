package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class AuthorizationTests extends AbstractClass {

    @Test
    @Order(1)
    void loginTest() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")), "Veresk")
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")), "c4b213d341");
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[3]/button/div")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
    }

    @Test
    @Order(2)
    void checkMyBlog() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"app\"]/main/nav/a/span")))
                .pause(500L).build().perform();
        Assertions.assertTrue(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/nav/ul/li[3]/a")
                ), "Veresk").apply(getDriver())
        );
        Thread.sleep(1000);
    }

    @Test
    @Order(3)
    void logOutTest() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"app\"]/main/nav/ul/li[3]/a")))
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"app\"]/main/nav/ul/li[3]/div/ul/li[3]/span[2]")));
        Thread.sleep(1000);

        Assertions.assertFalse(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/nav/ul/li[3]/a")
                ), "Veresk").apply(getDriver())
        );
    }
}
