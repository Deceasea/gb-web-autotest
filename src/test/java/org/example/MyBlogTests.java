package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MyBlogTests extends AbstractClass {

    @Test
    @Order(1)
    void publicationExists() throws InterruptedException {
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
        search.click(getDriver().findElement(By.xpath("//*[@id=\"app\"]/main/div/div[3]/div[1]/a[2]/img")))
                .pause(500L).build().perform();
        Thread.sleep(1000);
    }

}
