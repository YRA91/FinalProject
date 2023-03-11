package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// definim clasa

// Scenariul 1 cu adresa de mail
public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

// Scenariul 1 a butonului de mail submit buton
    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

// definesc butonul si descarc din pagina web dand clik dreapta pe buton apoi inspect apoi copy si copy xpath pentru a trece linkul ca in ex Start Enrollment

    // Scenariul 2
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollment;


// Scenariul 3
    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement faqHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionsButton;

    // Scenariul 4
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtual;

    // Scenariul 5
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybrid;

    // Scenariul 6
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement inPerson;

    // Scenariul 7

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement LearnTheFundamentals;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement ReadMoreLearnTheFundamentalsButton;


    // mai jos definesc metoda butonului Ex. butonul de Start Enrollment

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Scenariul 1
    public void clickOnSubmitButton(){
        this.submitButton.click();
    }
    public WebElement getEmailField() { return this.emailField; }
    public void writeEmailToEmailField(String email){
        this.emailField.sendKeys(email);
    }

    // Scenariul 2
    public void clickOnEnrollmentButton() {
        this.startEnrollment.click();
    }

    // Scenariul 3
    public String getFaqHeader(){
        return this.faqHeader.getText();
    }
    public void clickOnQuestionsButton(){this.questionsButton.click();}

    // Scenariul 4
    public void clickOnReadMoreButtonFromVirtual(){this.virtual.click();}

    // Scenariul 5
    public void clickOnReadMoreButtonFromHybrid(){this.hybrid.click();}

    // Scenariul 6
    public void clickOnReadMoreButtonFromInPerson(){this.inPerson.click();}

    // Scenariul 7
    public void clickOnReadMoreButtonFromLearnTheFundamentals(){this.ReadMoreLearnTheFundamentalsButton.click();}
    public WebElement getLearnTheFundamentals(){return this.LearnTheFundamentals;}

    // Scenariul 8

    public String getOurInstructors(){return this.ourInstructors()}

}