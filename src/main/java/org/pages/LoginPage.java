package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class LoginPage {

    private final SelenideElement user = $(By.id("userEmail"));
    private final SelenideElement password = $(By.id("userPassword"));
    private final SelenideElement loginButton = $(By.id("login"));

    private final SelenideElement loginconfirms =$(By.xpath("//p[text()='Automation Practice']"));
   private final SelenideElement checkbox= $(By.xpath("(//input[@type='checkbox'])[12]"));
    public void login(String value, String values) {

        user.setValue(value);
        password.setValue(values);
        loginButton.click();
       checkbox.click();
    }
    public void verifyLogin(String expectedd){
        loginconfirms.shouldHave(text(expectedd));
        checkbox.shouldBe(Condition.selected);
    }
}