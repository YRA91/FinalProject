package org.example;

import PageObject.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;


import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
// public este cu constructor sau o metoda

public class StepDefinitions {

    private WebDriver driver;
    private MainPage mainPage;
    private EnrollmentPage enrollmentPage;
    private VirtualPage virtualPage;
    private HybridPage hybridPage;
    private InPersonPage inPersonPage;
    private LearnTheFundamentalsPage learnTheFundamentalsPage;

    private PersonalInfoPage personalInfoPage;
    private ContactInfoPage contactInfoPage;
    private CourseOptionsPage courseOptionsPage;
    private PaymentInfoPage paymentInfoPage;

    public StepDefinitions() {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        enrollmentPage = new EnrollmentPage(driver);
        virtualPage = new VirtualPage(driver);
        hybridPage = new HybridPage(driver);
        inPersonPage = new InPersonPage(driver);
        learnTheFundamentalsPage = new LearnTheFundamentalsPage(driver);

        personalInfoPage = new PersonalInfoPage(driver);
        contactInfoPage = new ContactInfoPage(driver);
        courseOptionsPage = new CourseOptionsPage(driver);
        paymentInfoPage = new PaymentInfoPage(driver);

    }

// @ reprezinta adnotare

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("file:///C:/Users/mariu/Desktop/GitHub/Testing-Env/index.html");
    }

// Scenariul 1

    @When("I write the email address of {string}")
    public void i_write_the_email_address_of(String string) {
        mainPage.writeEmailToEmailField(string);
    }
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @Then("the confirmation pop-up appears")
    public void theConfirmationPopUpAppear(){
        driver.switchTo().alert().accept();
    }

    // Scenariul 2

    @Given("Start The Enrollment")
    public void StartTheEnrollment() {
        driver.get("file:///C:/Users/mariu/Desktop/GitHub/Testing-Env/routes/enrollment.html"); }
    @When("I click start the enrollment")
    public void i_click_start_the_enrollment() {
        mainPage.clickOnEnrollmentButton();
    }

    @Then("the new page opens")
    public void the_new_page_opens() {
        Assert.assertEquals(enrollmentPage.getPersonalInformationHeader(),"Personal information");
    }


// Scenariu 3
    @When("I click the Question button")
    public void I_click_the_Question_button(){mainPage.clickOnQuestionsButton();}

    @Then("the page goes down to the FAQ sections")
    public void thePageGoesDownToTheFAQsections () {
        Util.waitForElementToLoad(3);
        Assert.assertEquals(mainPage.getFaqHeader(),"Frequently Asked Questions");
    }

// Scenariu 4

    @When("I click the Read More button from Virtual")
    public void I_click_the_Read_More_button_from_virtual(){
        Util.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreButtonFromVirtual();}

    @Then("the new page opens from Virtual")
    public void the_new_page_opens_from_Virtual(){
        Assert.assertEquals(virtualPage.getVirtualHeader(), "Virtual");
    }

// Scenariul 5

    @When("I click the Read More button from Hybrid")
    public void i_click_the_Read_More_button_from_Hybrid(){
        Util.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreButtonFromHybrid();}

    @Then("the new page opens from Hybrid")
    public void the_new_page_opens_from_Hybrid(){
        Assert.assertEquals(hybridPage.getHybridHeader(), "Hybrid");
    }

// Scenariul 6

    @When("I click the Read More button from In Person")
    public void i_click_the_Read_More_button_from_In_Person(){
        Util.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreButtonFromInPerson();}

    @Then("the new page opens from In Person")
    public void the_new_page_opens_from_In_Person(){
        Assert.assertEquals(inPersonPage.getinPersonHeader(), "In Person");
    }

// Scenariul 7

    @When("I click the Read More button from Learn The Fundamentals")
    public void i_click_the_Read_More_button_from_Learn_The_Fundamentals(){
        Util.scrollToElement(driver,mainPage.getLearnTheFundamentals());
        mainPage.clickOnReadMoreButtonFromLearnTheFundamentals();}

    @Then("the new page opens from Fundamentals page")
    public void the_new_page_opens_from_Fundamentals_page(){
        Assert.assertEquals(learnTheFundamentalsPage.getlearnTheFundamentalsHeader(),"Fundamentals page");}

// Scenariul 8
    @When("I click the Istructors button")
    public void I_click_the_Instructors_button(){mainPage.clickOnInstructorsButton();}

    @Then("the page goes down to the Our Instructors")
    public void thePageGoesDownToTheOurInstructors(){
        Util.waitForElementToLoad(3);
        Assert.assertEquals(mainPage.getOurInstructors(),"Our Instructors");}

// Scenariul 9

    @When("I click the blue arrow from the bottom of the page")
    public void I_click_the_blue_arrow_the_bottom_of_the_page(){
        Util.scrollToElement(driver,mainPage.getContactInfo());
        mainPage.clickOnArrowBotton();}

    @Then("the page move back to the top")
    public void thePageMoveBackToTheTop(){
        Util.scrollToElement(driver,mainPage.getTheTop());
    }


    // Scenariul 10

    @Given("I am on the course options page")
    public void iAmOnCourseOptionsPage (){
        driver.get("file:///C:/Users/mariu/Desktop/GitHub/Testing-Env/routes/enrollment.html");
        personalInfoPage.fillInPersonalInformation();
        Util.scrollToElement(driver, personalInfoPage.getNextButton());
        personalInfoPage.clickOnNextButton();
        contactInfoPage.fillInContactInformation();
        Util.scrollToElement(driver, contactInfoPage.getNextButton());
        contactInfoPage.clickOnNextButton();}

    @When("I select the manual tester option")
    public void iSelectManualTesterOption (){courseOptionsPage.clickOnManualTesterButton(); }

    @When("I click the next button from the course options page")
    public void iClickTheNextButtonFromCourseOptions () {
        Util.scrollToElement(driver, courseOptionsPage.getNextButton());
        courseOptionsPage.clickOnNextButton();}

    @Then("a payment information page opens")
    public void paymentInfoPageOpens (){
        Util.waitForElementToLoad(2);
        Assert.assertEquals(paymentInfoPage.getPaymentInfoHeader(), "Payment information");}



    @After
    public void cleanUp() {
        driver.quit();
    }





}