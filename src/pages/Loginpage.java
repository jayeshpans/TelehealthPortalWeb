package pages;

import lib.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends PageActions {
    private final WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }
    By pageTitle = By.xpath("//div[@class=\"card-body\"]/p");
    By subPageTitle = By.className("text-muted");
    By loginBtn = By.xpath("//button[@title=\"Sign In\"]");
    By passwordLink = By.xpath("//button[@title=\"Forgot Password?\"]");
    By emailInpt = By.xpath("//input[@formcontrolname=\"username\"]");
    By passwordInpt = By.xpath("//input[@formcontrolname=\"password\"]");
    By loginErrorMsg = By.xpath("//div[@id=\"noty_layout__topRight\"]/div/div");
    public String getLoginPageTitle() {
        return getTxt(driver, pageTitle).replaceAll("\\s", " ");
    }
    public String getLoginPageSubTitle() {
        return getTxt(driver, subPageTitle);
    }
    public String getLoginBtnTxt() {
        return getTxt(driver, loginBtn);
    }

    public String getForgotPasswordTxt() {
        return getTxt(driver, passwordLink);
    }

    public String getLoginBtnTitle() {
        return getEleAttribute(driver, loginBtn, "title");
    }

    public void emailsendKeys(String inputValue) {
        sendInputs(driver, emailInpt, inputValue);
    }

    public void passwordSendKeys(String inputValue) {
        sendInputs(driver, passwordInpt, inputValue);
    }

    public void clickSignInBtn() {
        ClickBtn(driver, loginBtn);
    }


    public void getLoginPageErrorMessage() {

        System.out.println(getTxt(driver, loginErrorMsg));
    }
}
