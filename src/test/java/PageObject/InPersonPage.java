package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InPersonPage {

    @FindBy(xpath = "/html/body/h1")
    private WebElement inPersonHeader;

   public InPersonPage(WebDriver driver){
       PageFactory.initElements(driver, this);
   }
    public String getinPersonHeader(){
       return inPersonHeader.getText();
    }
}
