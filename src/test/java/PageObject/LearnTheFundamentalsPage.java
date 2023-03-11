    package PageObject;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;

    public class LearnTheFundamentalsPage {

    @FindBy(xpath = "/html/body/h1")
        private WebElement learnTheFundamentalsHeader;
    public LearnTheFundamentalsPage(WebDriver driver){PageFactory.initElements(driver, this);}

        public String getlearnTheFundamentalsHeader(){
        return learnTheFundamentalsHeader.getText();
        }
}
