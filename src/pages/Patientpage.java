package pages;

import lib.PageActions;
import lib.WaitActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class Patientpage extends PageActions {
    private final WebDriver driver;

    public Patientpage(WebDriver driver) {
        this.driver =driver;
    }
    By patientBtn = By.xpath("//app-sidebar-nav-link[@class=\"nav-item\"]/a");
    By AddPatientBtn = By.xpath("//button[@title=\"Add Patient\"]");
    By addPatientTitle = By.xpath("//span[text()=\" Add Patient \"] ");
    By backAddPatientPage = By.xpath("//img[@alt=\"back-icon\"]");
    By patientDetailslbl = By.xpath("//span[text()=\"Patient Details\"]");

    // name input
    By namelbl = By.xpath("//Strong[text()=\" Name\"]");
    By nameIpt = By.id("name");
    By nameErrorMsg = By.xpath("//input[@id=\"name\"]/parent::div/div[1]/div");

    // Email input
    By emaillbl = By.xpath("//strong[text()=\"Email Id \"]");
    By emailInpt = By.id("emailId");
    By emailErrorMsg = By.xpath("//input[@id=\"emailId\"]/parent::div/div[1]/div");
    // country name
    By phoneNumberlbl = By.xpath("//strong[text()=\"Phone Number \"]");
    By countryDDl = By.xpath("//ng-select[@formcontrolname=\"countryCode\"]");
    By getCountryDDlList = By.xpath("//ng-select[@formcontrolname=\"countryCode\"]/ng-dropdown-panel/div/div[2]/div");
    By phonenumberId = By.id("phoneNumber");
    By phonenumberError = By.xpath("//input[@id=\"phoneNumber\"]/parent::div/following-sibling::div/div");
    // gender input
    By genderLbl = By.xpath("//strong[text()=\"Gender \"]");
    By maleRadio = By.id("chkMale");
    By malelbl = By.xpath("//label[text()=\"Male\"]");
    By femaleRadio =By.id("chkFemale");
    By femalelbl = By.xpath("//label[text()=\"Female\"]");
    By otherRadio = By.id("chkOther");
    By otherlbl = By.xpath("//label[text()=\"Other\"]");
    // calendar
    By cal = By.id("dob");
    By BODlbl = By.xpath("//strong[text()=\"DOB \"]");
    //age
    By agelbl = By.xpath("//strong[text()=\"Age \"]");
    By ageIpt = By.id("age");
    //Blood group
    By bloodgrouplbl = By.xpath("//strong[text()=\"Blood Group\"]");
    By getBloodgroupinpt = By.xpath("//select[@formcontrolname=\"bloodGroup\"]");
    //Manstrual input
    By menstlbl = By.xpath("//strong[text()=\"Last Menstrual Period \"]");
    By manstInpt = By.id("lmp");

    //identification type
    By identilbl = By.xpath("//strong[text()=\"Identification Type \"]");
    By identiInpt = By.xpath("//select[@formcontrolname=\"identificationIdType\"]");
    //identification value
    By identiValuelbl = By.xpath("//strong[text()=\"Identification Value \"]");
    By identifiValueInpt = By.id("identificationIdNo");
    // pateint id
    By patientidlbl = By.xpath("//strong[text()=\"Patient ID \"]");
    By patientidInpt = By.id("caseId");
    //address
    By addresslbl = By.xpath("//strong[text()=\"Address \"]");
    By addressInpt = By.id("address");
    //city
    By citylbl = By.xpath("//strong[text()=\"City \"]");
    By cityinpt = By.id("city");
    //state
    By statelbl = By.xpath("//strong[text()=\"State \"]");
    By stateInpt = By.id("state");
    //pincode
    By pincodelbl = By.xpath("//strong[text()=\"Pincode \"]");
    By pincodeInpt = By.id("pinCode");

    //Personal Medical History
    By personalMedHistory = By.xpath("//span[text()=\"Personal Medical History\"]");
    By getPersonalMedHistoryDiv = By.xpath("//span[text()=\"Personal Medical History\"]/parent::div/parent::div");

    By conditionlbl = By.xpath("//strong[text()=\"Do you currently have any existing condition(s)?\"]");
    By conditiondefaultMsg = By.xpath("//strong[text()=\"Do you currently have any existing condition(s)?\"]/parent::div/following-sibling::div[1]");
    By conditionAddBtn = By.xpath("//strong[text()=\"Do you currently have any existing condition(s)?\"]/parent::div/following-sibling::div[3]/div/button");

    By surgerieslbl = By.xpath("//strong[text()=\"Have you had any surgery/surgeries in the past? Please mention year if known \"]");
    By surgeriesDefaultMsg = By.xpath("//strong[text()=\"Have you had any surgery/surgeries in the past? Please mention year if known \"]/parent::div/following-sibling::div[1]");
    By getSurgeriesAddBtn = By.xpath("//strong[text()=\"Have you had any surgery/surgeries in the past? Please mention year if known \"]/parent::div/following-sibling::div[3]/div/button");

    By medicinelbl = By.xpath("//strong[text()=\"Are you currently taking any medicines?\"]");
    By medicineDefualtMsg = By.xpath("//strong[text()=\"Are you currently taking any medicines?\"]/parent::div/following-sibling::div[1]");
    By medicineAddBtn = By.xpath("//strong[text()=\"Are you currently taking any medicines?\"]/parent::div/following-sibling::div[2]/form/app-typeahead-focus-medicine/button");

    //lifestyle and allergies
    By lifeAlllbl = By.xpath("//span[text()=\"Lifestyle & Allergies\"]");
    By drinkAlcohol = By.xpath("//strong[text()=\"Do you drink alcohol? \"]");
    By moderation = By.xpath("//strong[text()=\"Do you drink alcohol in moderation? (1 for women, 2 for men) \"]");
    By smoke = By.xpath("//strong[text()=\"Do you smoke? \"]");
    By tobacco = By.xpath("//strong[text()=\"Do you chew tobacco? \"]");
    By smokedInPast = By.xpath("//strong[text()=\"Have you ever smoked in the past? \"]");
    By tobaccoInPast = By.xpath("//strong[text()=\"Have you ever chewed tobacco in the past? \"]");
    By recreatinalDrug = By.xpath("//strong[text()=\"Do you take any recreational drugs? \"]");
    By knownAllergy = By.xpath("//strong[text()=\"Any known drug allergies? \"]");
    By otherAllergy = By.xpath("//strong[text()=\"Any other allergies? \"]");
    //family details
    By familyDetials = By.xpath("//span[text()=\"Family Details\"]");
    By familyDetailsMsg = By.xpath("//div[text()=\" No family members added \"]");
    By addPatientBtn = By.xpath("//button[@title=\"Add Patient\"]");
    By getPatientNamedtl =By.xpath("//span[@class=\"patient-name\"]");
    By getpatientAgeGenderdtl = By.xpath("//span[@class=\"age-gender\"]");
    By getPatientIddtl = By.xpath("//div[@class=\"pr-lg-5 pr-md--5\"]/span[@class=\"patient-details\"]");
    By getPatientemaildtl =By.xpath("//div[@class=\"pl-lg-5 pl-md--5\"]/span[@class=\"patient-details\"]");
    By getPatientPhoneNumberdtl =By.xpath("//div[@class=\"mb-2\"]/span[@class=\"patient-details\"]");
    By getAddressdtl = By.xpath("//div[@class=\"user-detail row mt-3\"][1]/div[1]/div[1]/div[1]/div[2]");
    By getCitydtl =By.xpath("//div[@class=\"user-detail row mt-3\"][1]/div[1]/div[1]/div[2]/div[2]");
    By getStatedtl = By.xpath("//div[@class=\"user-detail row mt-3\"][1]/div[1]/div[1]/div[3]/div[2]");
    By getPincodedtl = By.xpath("//div[@class=\"user-detail row mt-3\"][1]/div[1]/div[1]/div[4]/div[2]");
    By getBloodGrouodtl = By.xpath("//div[@class=\"user-detail row mt-3\"][1]/div[1]/div[1]/div[5]/div[2]");
    By getIdentiTypedtl = By.xpath("//div[@class=\"user-detail row mt-3\"][1]/div[1]/div[2]/div[1]/div[2]");
    By getIdentiValuedtl = By.xpath("//div[@class=\"user-detail row mt-3\"][1]/div[1]/div[2]/div[2]/div[2]");
    By editBtn = By.xpath("//button[@title=\"Edit\"]");
    By patientUpdateBtn = By.xpath("//button[@title=\"Update Patient\"]");
    By deletePatientBtn = By.xpath("//button[@title=\"Delete\"]");
    By patientDelConfirmPopupTitle = By.className("modal-title");
    By patientDelConfirmPopupBody = By.className("modal-body");
    By patientDelConfirmBtn = By.xpath("//div[@class=\"modal-footer\"]/button[text()=\" Confirm \"]");
    public void openAddPatientForm() {
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.elePresent(driver, AddPatientBtn, 200);
        clickBtn(driver, AddPatientBtn);
    }

    public void openAddPatientPage() {
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.elePresent(driver, patientBtn, 200);
        clickBtn(driver, patientBtn);
    }

    public String getAddPatientTitle() {
        return getTxt(driver, addPatientTitle);
    }

    public String getPatientDetailtxt() {
        return getTxt(driver, patientDetailslbl);
    }

    public String getNametxt() {
        return getTxt(driver, namelbl);
    }

    public String getEmailidtxt() {
        return getTxt(driver, emaillbl);
    }

    public String getPhoneNumbertxt() {
        return getTxt(driver, phoneNumberlbl);
    }

    public String getGendertxt() {
        return getTxt(driver, genderLbl);
    }

    public String getBODtxt() {
        return getTxt(driver, BODlbl);
    }

    public String getAgetxt() {
        return getTxt(driver, agelbl);
    }

    public String getBloodGrouptxt() {
        return getTxt(driver, bloodgrouplbl);
    }

    public String getLastMentxt() {
        return getTxt(driver, menstlbl);
    }

    public String getIdentificationType() {
        return getTxt(driver, identilbl);
    }

    public String getIdentificationValue() {
        return getTxt(driver, identiValuelbl);
    }

    public String getPatientId() {
        return getTxt(driver, patientidlbl);
    }

    public String getAddress() {
        return getTxt(driver, addresslbl);
    }

    public String getCity() {
        return getTxt(driver, citylbl);
    }

    public String getState() {
        return getTxt(driver, statelbl);
    }

    public String getPincode() {
        return getTxt(driver, pincodelbl);
    }

    public void clickPatientDetailsSection() {
        clickBtn(driver, addPatientTitle);
    }

    public String getpersonalMedtxt() {
        return getTxt(driver, personalMedHistory);
    }

    public void clickOnPersonalMedssection() {
        clickBtn(driver, personalMedHistory);
    }

    public String getconditiontxt() {
        return getTxt(driver, conditionlbl);
    }

    public String getconditionSubtxt() {
        return getTxt(driver, conditiondefaultMsg);
    }

    public String getsurgriestxt() {
        return getTxt(driver, surgerieslbl);
    }

    public String getsurgriesSubtxt() {
        return getTxt(driver, surgeriesDefaultMsg);
    }

    public String getmedicinetxt() {
        return getTxt(driver, medicinelbl);
    }

    public String getmedicineSubtxt() {
        return getTxt(driver, medicineDefualtMsg);
    }

    public String lifestylettxt() {
        return getTxt(driver, lifeAlllbl);
    }

    public void clickOnLifestyleSection() {
        clickBtn(driver, lifeAlllbl);
    }

    public String getdrinkAlcoholtxt() {
        return getTxt(driver, drinkAlcohol);
    }

    public String getModerationtxt() {
        return getTxt(driver, moderation);
    }

    public String getsmoketxt() {
        return getTxt(driver, smoke);
    }

    public String gettobaccotxt() {
        return getTxt(driver, tobacco);
    }

    public String smokedPasttxt() {
        return getTxt(driver, smokedInPast);
    }

    public String tobaccooInPast() {
        return getTxt(driver, tobaccoInPast);
    }

    public String recreatiionaltxt() {
        return getTxt(driver, recreatinalDrug);
    }

    public String getdrugAllergytxt() {
        return getTxt(driver, knownAllergy);
    }

    public String getOtherAllergytxt() {
        return getTxt(driver, otherAllergy);
    }

    public String getFamilyDetailstxt() {
        return getTxt(driver, familyDetials);
    }

    public void clickOnFamilydetailsection() {
        clickBtn(driver, familyDetials);
    }

    public String getFamilyDetailSubTxt() {
        return getTxt(driver, familyDetailsMsg);
    }

    public List<WebElement> getPhoneNumberCountryList() {
        clickBtn(driver, countryDDl);
        List<WebElement> getcountrycode = driver.findElements(getCountryDDlList);
        return getcountrycode;
//        if(!getcountrycode.isEmpty()){
//            for (WebElement listcountrycode:getcountrycode){
//                String countryCode = listcountrycode.getText();
//                System.out.println(countryCode);
//            }
//        }else {
//            System.out.println("No country code is available");
//        }
    }

    public List<WebElement> getBloodGroupList() {
        Select bloodGroupDDL = new Select(driver.findElement(getBloodgroupinpt));
        return (List<WebElement>) bloodGroupDDL;
//        for (WebElement bloodGroupList : bloodGroupDDL.getOptions()){
//            System.out.println(bloodGroupList.getText());
//            return Collections.singletonList(bloodGroupList.getText());
//        }
    }

    public String getNameErrorMsg(String inputtxt) {
        clearInputs(driver, nameIpt);
        sendInputs(driver, nameIpt, inputtxt);
        clickBtn(driver, emailInpt);
        String getnameErrorMsg = getTxt(driver, nameErrorMsg);
        return getnameErrorMsg;
    }
    public String getEmailErrorMsg(String inputtxt) {
        clearInputs(driver, emailInpt);
        sendInputs(driver, emailInpt, inputtxt);
        clickBtn(driver, phonenumberId);
        return getTxt(driver, emailErrorMsg);
    }

    public String getPhoneNumberErrorMsg(String inputtxt) {
        clickBtn(driver, phonenumberId);
        sendInputs(driver, phonenumberId, inputtxt);
        clickBtn(driver, emailInpt);
        return getTxt(driver, phonenumberError);
    }

    public void sendnameInpt(String userName) {
        clearInputs(driver, nameIpt);
        sendInputs(driver, nameIpt, userName);
    }

    public void sendemailIdInpt(String emailId) {
        clickBtn(driver, emailInpt);
        sendInputs(driver, emailInpt, emailId);
    }

    public void selectPhoneCountry(String countryDDL) {
        clickBtn(driver, countryDDl);
        By indiaCountry = By.xpath("//div[@title="+'"'+countryDDL+'"'+"]");
        clickBtn(driver, indiaCountry);
    }
    public void sendPhoneNumberInpt(String phoneNumberInpt) {
        clearInputs(driver, phonenumberId);
        sendInputs(driver, phonenumberId, phoneNumberInpt);
    }

    public void clickAddPatientBtn() {
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.eleClickable(driver, addPatientBtn, 10);
        clickBtn(driver, addPatientBtn);
    }

    public void sendDOBInpt(String calInpt) {
        sendInputs(driver, cal, calInpt);
    }

    public void selectBloodgroupInpt(String ddlinpt) {
        selectDDLVisibleTxt(driver, getBloodgroupinpt, ddlinpt);
    }

    public void sendIdentificationType(String ddlinpt) {
        selectDDLValue(driver, identiInpt, ddlinpt);
    }

    public void sendIdentificationValue(String identiInptVal) {
        clearInputs(driver,identifiValueInpt);
        sendInputs(driver, identifiValueInpt, identiInptVal);
    }

    public void sendPatientIdInpt(String patientid) {
        clearInputs(driver, patientidInpt);
        sendInputs(driver, patientidInpt, patientid);
    }

    public void sendAddressInpt(String addressInptVal) {
        clearInputs(driver, addressInpt);
        sendInputs(driver, addressInpt, addressInptVal);
    }

    public void sendCityInpt(String cityVal) {
        clearInputs(driver, cityinpt);
        sendInputs(driver, cityinpt, cityVal);
    }

    public void sendStateInpt(String stateVal) {
        clearInputs(driver, stateInpt);
        sendInputs(driver, stateInpt, stateVal);
    }

    public void sendPincodeInpt(String pincodeVal) {
        clearInputs(driver, pincodeInpt);
        sendInputs(driver,pincodeInpt, pincodeVal);
    }

    public String getPatientIdTable(String patientId) {
        By patientIdTlb = By.xpath("//span[text()="+'"'+patientId+'"'+"]");
        return getTxt(driver, patientIdTlb);
    }

    public String getPatientNameTable(String patientId) {
        By patientNameTlb = By.xpath("//span[text()="+'"'+patientId+'"'+"]/parent::td/parent::tr/td[2]");
        return getTxt(driver, patientNameTlb);
    }

    public String getgenderTable(String patientId) {
        By genderTlb = By.xpath("//span[text()="+'"'+patientId+'"'+"]/parent::td/parent::tr/td[3]");
        return getTxt(driver, genderTlb);

    }

    public String getAgeTable(String patientId) {
        By ageTlb = By.xpath("//span[text()="+'"'+patientId+'"'+"]/parent::td/parent::tr/td[4]");
        return getTxt(driver, ageTlb);
    }

    public String getPhoneNumberTable(String patientId) {
        By phoneNumberTlb = By.xpath("//span[text()="+'"'+patientId+'"'+"]/parent::td/parent::tr/td[5]");
        return getTxt(driver, phoneNumberTlb);
    }

    public void clickOnPatientTr(String patientId) {
        By patientTrTlb = By.xpath("//span[text()="+'"'+patientId+'"'+"]/parent::td/parent::tr");
        clickBtn(driver, patientTrTlb);
    }

    public String getPatientNamedtl() {
        return getTxt(driver, getPatientNamedtl);
    }

    public String getAgedtl() {
        return getTxt(driver, getpatientAgeGenderdtl);
    }

    public void getGenderdtl() {
    }

    public String getPatientiddtl() {
        return getTxt(driver, getPatientIddtl);
    }

    public String getPhoneNumberdtl() {
        return getTxt(driver, getPatientPhoneNumberdtl);
    }

    public String getEmailIddtl() {
        return getTxt(driver, getPatientemaildtl);
    }

    public String getAddressdtl() {
        return getTxt(driver, getAddressdtl);
    }

    public String getCitydtl() {
        return getTxt(driver, getCitydtl);
    }

    public String getStatedtl() {
        return getTxt(driver, getStatedtl);
    }

    public String getPincodedtl() {
        return getTxt(driver, getPincodedtl);
    }

    public String getBloodGroupdtl() {
        return getTxt(driver, getBloodGrouodtl);
    }

    public String getIdentiTypetl() {
        return getTxt(driver, getIdentiTypedtl);
    }

    public String getIdentiValuedtl() {
        return getTxt(driver, getIdentiValuedtl);
    }

    public void clickonPatientEditBtn() {
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.eleClickable(driver, editBtn, 10);
        clickBtn(driver, editBtn);
    }

    public void clickOnPatientUpdateBtn() {
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.eleClickable(driver, patientUpdateBtn, 10);
        clickBtn(driver, patientUpdateBtn);
    }
    public void clickOnPatientDeleteBtn() {
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.eleClickable(driver, deletePatientBtn, 10);
        clickBtn(driver, deletePatientBtn);
    }

    public String getDeleteTitle() {
        return getTxt(driver, patientDelConfirmPopupTitle);
    }

    public String getDeleteMsg() {
        return getTxt(driver, patientDelConfirmPopupBody);
    }

    public void ClickonConfirmBtn() {
        clickBtn(driver, patientDelConfirmBtn);
    }
}
