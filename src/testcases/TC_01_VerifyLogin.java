
package testcases;

import lib.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loginpage;

import java.io.IOException;

public class TC_01_VerifyLogin extends BaseClass {

    @Test(priority = 1)
    public void validateLoginUIPage(){
        Loginpage objLoginpage = new Loginpage(getDriver());
        Assert.assertEquals(objLoginpage.getLoginPageTitle(), "Welcome to KnowYourMeds Telehealth Portal");
        Assert.assertEquals(objLoginpage.getLoginPageSubTitle(), "Sign In to your account");
        Assert.assertEquals(objLoginpage.getLoginBtnTitle(), "Sign In");
        Assert.assertEquals(objLoginpage.getLoginBtnTxt(), "Sign In");
        Assert.assertEquals(objLoginpage.getForgotPasswordTxt(), "Forgot Password?");
    }
//    @Test(priority = 2)
//    public void validateLoginPageWithInvalidCreds(){
//        Loginpage objLoginpage = new Loginpage(getDriver());
//        objLoginpage.emailsendKeys("test@gmail.com");
//        objLoginpage.passwordSendKeys("Admin");
//        objLoginpage.clickSignInBtn();
//        objLoginpage.getLoginPageErrorMessage();
//        //Invalid username/password
//    }
    @Test(priority = 3, groups = "smoke")
    public void validateLoginPageWithValidCreds() throws IOException {
        Loginpage objLoginpage = new Loginpage(getDriver());
        objLoginpage.emailsendKeys(readProperty().getProperty("OperatorUserName"));
        objLoginpage.passwordSendKeys(readProperty().getProperty("OperatorPassword"));
        objLoginpage.clickSignInBtn();
    }
}
