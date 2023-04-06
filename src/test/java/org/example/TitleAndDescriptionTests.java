package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class TitleAndDescriptionTests extends AbstractClass{

    @Test
    @Order(1)
    void homePage() throws InterruptedException {
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
    void createPublication() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"create-btn\"]")))
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"create-item\"]/div/div/div[1]/div/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"create-item\"]/div/div/div[1]/div/label/input")), "ЭТО ТАЙТЛ")
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"create-item\"]/div/div/div[2]/div/label/span/textarea")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"create-item\"]/div/div/div[2]/div/label/span/textarea")), "ЭТО ДЕСРИПШЕН")
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"create-item\"]/div/div/div[7]/div/button/span")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
    }
    @Test
    @Order(3)
    void titleExists() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"app\"]/main/nav/a/span")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
        Assertions.assertTrue(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/div/div[3]/div[1]/a[1]")
                ), "ЭТО ТАЙТЛ").apply(getDriver())
        );
    }
    @Test
    @Order(4)
    void descriptionExists() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"app\"]/main/nav/a/span")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
        Assertions.assertTrue(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/div/div[3]/div[1]/a[1]")
                ), "ЭТО ДЕСРИПШЕН").apply(getDriver())
        );
    }
}
