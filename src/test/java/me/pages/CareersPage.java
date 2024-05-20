package me.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersPage extends BasePage{

    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptCookiesBtn;

    @FindBy(name = "keys")
    public WebElement keysInput;

     @FindBy(name = "teams")
    public WebElement teamSelect;

     @FindBy(name = "offices")
    public WebElement locationSelect;

     @FindBy(xpath = "//button[@type='submit']")
    public WebElement findPositionBtn;

     @FindBy(xpath = "//span[contains(@class, 'title') and contains(text(), 'Software Engineer')]")
    public List<WebElement> listOpenPositions;

     @FindBy(xpath = "//p[@class='result-info']")
    public WebElement resultInfo;


}
