package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class UserWithoutPublications extends AbstractClass{
    @Test
    @Order(1)
    void loginTest() throws InterruptedException {
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[1]/label/input")), "ivanchik4567")
                .pause(500L).build().perform();
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")))
                .pause(500L).build().perform();
        search.sendKeys(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[2]/label/input")), "2baaaf6d52");
        search.click(getDriver().findElement(By.xpath("//*[@id=\"login\"]/div[3]/button/div")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
        Assertions.assertTrue(
                textToBePresentInElement(getDriver().findElement(
                        By.xpath("//*[@id=\"app\"]/main/div")
                ), "No items for your filter").apply(getDriver())
        );
    }
}
