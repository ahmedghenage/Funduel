package me.pages;

import me.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract  class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
