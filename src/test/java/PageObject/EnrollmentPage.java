package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPage {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[1]/label")
    private WebElement FirstName;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement PersonalInformationHeader;

    public EnrollmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getPersonalInformationHeader() {
        return PersonalInformationHeader.getText();
    }
    public void writeFirstName(String FirstName) {this.FirstName.sendKeys(FirstName);

    }
}
