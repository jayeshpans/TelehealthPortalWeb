package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitActions {

    public void elePresent(WebDriver driver, By webEle, int duruation) {
        WebDriverWait wait = new WebDriverWait(driver, duruation);
        wait.until(ExpectedConditions.presenceOfElementLocated(webEle));
    }
    public void eleClickable(WebDriver driver, By webEle, int duruation) {
        WebDriverWait wait = new WebDriverWait(driver, duruation);
        wait.until(ExpectedConditions.elementToBeClickable(webEle));
    }

}
