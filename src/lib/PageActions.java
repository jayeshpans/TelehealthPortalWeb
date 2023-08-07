package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
    public void clickBtn(WebDriver driver, By loginBtn) {
        driver.findElement(loginBtn).click();
    }
    public void selectDDLValue(WebDriver driver, By selectDDlEle, String valueddlInpt) {
        Select selectDDL = new Select(driver.findElement(selectDDlEle));
        selectDDL.selectByValue(valueddlInpt);
    }
    private void selectDDLIndex(WebDriver driver, By selectDDlEle, int indexddlInpt) {
        Select selectDDL = new Select(driver.findElement(selectDDlEle));
        selectDDL.selectByIndex(indexddlInpt);
    }
    public void selectDDLVisibleTxt(WebDriver driver, By selectDDlEle, String visibleddlInpt) {
        Select selectDDL = new Select(driver.findElement(selectDDlEle));
        selectDDL.selectByVisibleText(visibleddlInpt);
    }
    private List<WebElement> getAllSelOptions(WebDriver driver, By selectDDlEle) {
        Select selectDDL = new Select(driver.findElement(selectDDlEle));
        return selectDDL.getAllSelectedOptions();
    }
    private void deselectAll(WebDriver driver, By selectDDlEle) {
        Select selectDDL = new Select(driver.findElement(selectDDlEle));
        selectDDL.deselectAll();
    }
}
