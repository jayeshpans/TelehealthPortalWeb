package testcases;


import lib.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Patientpage;

public class TC_02_verifyAddPatient extends BaseClass {

    @Test(priority = 4, groups = "smoke")
    public void openAddPatientForm(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.openAddPatientPage();
        objPatientpage.openAddPatientForm();
    }
    @Test(priority = 5)
    public void verifyAddPatientUI(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.getAddPatientTitle();
        objPatientpage.getPatientDetailtxt();
        objPatientpage.getNametxt();
        objPatientpage.getEmailidtxt();
        objPatientpage.getPhoneNumbertxt();
        objPatientpage.getGendertxt();
        objPatientpage.getBODtxt();
        objPatientpage.getAgetxt();
        objPatientpage.getBloodGrouptxt();
        objPatientpage.getLastMentxt();
        objPatientpage.getIdentificationType();
        objPatientpage.getIdentificationValue();
        objPatientpage.getPatientId();
        objPatientpage.getAddress();
        objPatientpage.getCity();
        objPatientpage.getState();
        objPatientpage.getPincode();
        objPatientpage.clickPatientDetailsSection();

        objPatientpage.getpersonalMedtxt();
        objPatientpage.clickOnPersonalMedssection();
        objPatientpage.getconditiontxt();
        objPatientpage.getconditionSubtxt();
        objPatientpage.getsurgriestxt();
        objPatientpage.getsurgriesSubtxt();
        objPatientpage.getmedicinetxt();
        objPatientpage.getmedicineSubtxt();

        objPatientpage.lifestylettxt();
        objPatientpage.clickOnLifestyleSection();
        objPatientpage.getdrinkAlcoholtxt();
        objPatientpage.getModerationtxt();
        objPatientpage.getsmoketxt();
        objPatientpage.gettobaccotxt();
        objPatientpage.smokedPasttxt();
        objPatientpage.tobaccooInPast();
        objPatientpage.recreatiionaltxt();
        objPatientpage.getdrugAllergytxt();
        objPatientpage.getOtherAllergytxt();

        objPatientpage.getFamilyDetailstxt();
        objPatientpage.clickOnFamilydetailsection();
        objPatientpage.getFamilyDetailSubTxt();
    }
    @Test(priority = 5)
    public void verifyPhoneNumberCountryCode(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.getPhoneNumberCountryList();
    }
    @Test(priority = 6)
    public void verifyBloodGroupDDL(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.getBloodGroupList();
    }
    @Test(priority = 7)
    public void verifyAddPatientWithInvalidInpt(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        Assert.assertEquals(objPatientpage.getNameErrorMsg(""),"Name is required");
        String getNameErrorMsg2 = objPatientpage.getNameErrorMsg("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        Assert.assertEquals(getNameErrorMsg2,"Maximum length allowed : 100");
        Assert.assertEquals(objPatientpage.getEmailErrorMsg(" "),"Email is invalid");
        Assert.assertEquals(objPatientpage.getEmailErrorMsg("Test"),"Email is invalid");
        Assert.assertEquals(objPatientpage.getPhoneNumberErrorMsg(" "),"Phone Number is required");
        Assert.assertEquals(objPatientpage.getPhoneNumberErrorMsg("Test"), "Phone Number is required");
    }
    @Test(priority = 8)
    public void verifyAddPatientWithValidInpt(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.sendnameInpt("jayesh");
        objPatientpage.sendemailIdInpt("text@gmail.com");
        objPatientpage.selectPhoneCountry("India");
        objPatientpage.sendPhoneNumberInpt("7841845866");
        objPatientpage.sendDOBInpt("01-08-2022");
        objPatientpage.selectBloodgroupInpt("A+");
        objPatientpage.sendIdentificationType("1: Aadhaar Card");
        objPatientpage.sendIdentificationValue("BZVPP12345");
        objPatientpage.sendPatientIdInpt("ID009");
        objPatientpage.sendAddressInpt("Test Address");
        objPatientpage.sendCityInpt("Testcity");
        objPatientpage.sendStateInpt("testState");
        objPatientpage.sendPincodeInpt("412433");
        clickAddPatientBtn();
    }
    @Test(priority = 9)
    public void validateAddPatientInfo(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        Assert.assertEquals(objPatientpage.getPatientIdTable("ID009"), "ID009");
        Assert.assertEquals(objPatientpage.getPatientNameTable("ID009"), "jayesh");
        Assert.assertEquals(objPatientpage.getgenderTable("ID009"), "Male");
        Assert.assertEquals(objPatientpage.getAgeTable("ID009"),"1");
        Assert.assertEquals(objPatientpage.getPhoneNumberTable("ID009"),"+91-7841845766");
    }
    @Test(priority = 10)
    public void openPatientDetailPage(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.clickOnPatientTr("ID009");
    }
    @Test(priority = 11)
    public void validatePatientDetails(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        Assert.assertEquals(objPatientpage.getPatientNamedtl(), "jayesh");
        Assert.assertEquals(objPatientpage.getAgedtl(), "1, Male");
        objPatientpage.getGenderdtl();
        Assert.assertEquals(objPatientpage.getPatientiddtl(), "ID009");
        Assert.assertEquals(objPatientpage.getPhoneNumberdtl(), "+91-7841845766");
        Assert.assertEquals(objPatientpage.getEmailIddtl(), "Testtext@gmail.com");
        Assert.assertEquals(objPatientpage.getAddressdtl(), "Test Address");
        Assert.assertEquals(objPatientpage.getCitydtl(), "Testcity");
        Assert.assertEquals(objPatientpage.getStatedtl(), "testState");
        Assert.assertEquals(objPatientpage.getPincodedtl(), "412433");
        Assert.assertEquals(objPatientpage.getBloodGroupdtl(), "A+");
        Assert.assertEquals(objPatientpage.getIdentiTypetl(), "Aadhaar Card");
        Assert.assertEquals(objPatientpage.getIdentiValuedtl(), "BZVPP12345");
    }
    @Test(priority = 12)
    public void clickOnPatientDetailEditBtn(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.clickonPatientEditBtn();
    }
    @Test(priority = 13)
    public void updatePatientDetails(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.sendnameInpt("Jayesh Pansare");
        objPatientpage.sendPhoneNumberInpt("7841845855");
        objPatientpage.selectBloodgroupInpt("AB+");
        objPatientpage.sendAddressInpt("805 NE. Somerset Ave. Suwanee, GA 30024");
        objPatientpage.sendPincodeInpt("412400");
        clickonPatientUpdateBtn();
    }
    @Test(priority = 14)
    public void verifyUpdatedPatientInfo(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        Assert.assertEquals(objPatientpage.getPatientNamedtl(), "Jayesh Pansare");
        Assert.assertEquals(objPatientpage.getAgedtl(), "1, Male");
        objPatientpage.getGenderdtl();
        Assert.assertEquals(objPatientpage.getPatientiddtl(), "ID009");
        Assert.assertEquals(objPatientpage.getPhoneNumberdtl(), "+91-7841845855");
        Assert.assertEquals(objPatientpage.getEmailIddtl(), "Testtext@gmail.com");
        Assert.assertEquals(objPatientpage.getAddressdtl(), "805 NE. Somerset Ave. Suwanee, GA 30024");
        Assert.assertEquals(objPatientpage.getCitydtl(), "Testcity");
        Assert.assertEquals(objPatientpage.getStatedtl(), "testState");
        Assert.assertEquals(objPatientpage.getPincodedtl(), "412400");
        Assert.assertEquals(objPatientpage.getBloodGroupdtl(), "AB+");
        Assert.assertEquals(objPatientpage.getIdentiTypetl(), "Aadhaar Card");
        Assert.assertEquals(objPatientpage.getIdentiValuedtl(), "BZVPP12345");
    }
    @Test(priority = 15)
    public void deletePatient(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.clickOnPatientDeleteBtn();
    }
    @Test(priority = 16)
    public void verifyPatientDeletePopup(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.getDeleteTitle();
        objPatientpage.getDeleteMsg();
        objPatientpage.ClickonConfirmBtn();
    }
    private void clickonPatientUpdateBtn() {
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.clickOnPatientUpdateBtn();
    }

    public void clickAddPatientBtn(){
        Patientpage objPatientpage = new Patientpage(getDriver());
        objPatientpage.clickAddPatientBtn();
    }
}
