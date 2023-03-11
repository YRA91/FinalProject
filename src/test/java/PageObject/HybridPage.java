package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridPage {

    @FindBy(xpath = "/html/body/h1")
    private WebElement hybridHeader;

    public HybridPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getHybridHeader(){
        return hybridHeader.getText();
    }

}
