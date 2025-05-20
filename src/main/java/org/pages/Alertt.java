package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class Alertt {

    private final SelenideElement ElementBtn = $x("(//div[normalize-space()='Elements'])[1]");
    private final SelenideElement clickRadioOpt = $x("//span[normalize-space()='Radio Button']");
    private final SelenideElement clickbtn = $x("(//label[normalize-space()='Impressive'])[1]");



    public void Radiobtn() {
       // sleep(6000);
        ElementBtn.should(Condition.visible,Duration.ofSeconds(10)).click();
        clickRadioOpt.click();
        clickbtn.click();
    }

}


