package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AmzHomePage {

    private SelenideElement SearchText = $(By.xpath("(//input[@id='twotabsearchtextbox'])[1]"));

    private SelenideElement firstText = $(By.xpath("(//div[@aria-label='phone under 10k'])[1]"));

    private SelenideElement DropDown= $(By.xpath("//select[@id='searchDropdownBox']"));


    public  void invalidpageopen(){
     SelenideElement s=   $(By.xpath("//button[text()='Continue shopping']"));
     if(s.isDisplayed()){
            closeWebDriver();
            System.out.println("Invalid page handled");

     }
        System.out.println("Invalid page not shown");
    }

    public void Amz(String value) {
        SearchText.setValue(value);
        sleep(2000);
        firstText.click();
    }
    public void Drop(){

        DropDown.selectOptionByValue("search-alias=mobile-apps");
        DropDown.shouldHave(Condition.value("search-alias=mobile-apps"));
    }

}
