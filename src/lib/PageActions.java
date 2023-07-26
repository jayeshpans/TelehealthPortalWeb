package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageActions {
    public String getTxt(WebDriver driver, By pageTitle) {
        return driver.findElement(pageTitle).getText();
    }
    public String getEleAttribute(WebDriver driver, By loginBtn, String attr) {
        return driver.findElement(loginBtn).getAttribute(attr);
    }
    public void sendInputs(WebDriver driver, By emailInpt, String inputValue) {
        driver.findElement(emailInpt).sendKeys(inputValue);
    }
    public void clearInputs(WebDriver driver, By emailInpt) {
        driver.findElement(emailInpt).clear();
    }
    public void ClickBtn(WebDriver driver, By loginBtn) {
        driver.findElement(loginBtn).click();
    }
}
