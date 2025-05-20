package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class MultipleAlerts {
    private final SelenideElement SlectAert= $x("(//div[@class='card-up'])[3]");
    private final SelenideElement selectAlertbtn = $(By.xpath("//span[normalize-space()='Alerts']"));
    private final SelenideElement Alertoptbtn = $(By.xpath("//div[normalize-space()='Alerts, Frame & Windows']"));
    private final SelenideElement SimpleAlertbtn = $x("//button[@id='alertButton']");
    private final SelenideElement waitAlertbtn = $x("//button[@id='timerAlertButton']");
    private final SelenideElement confirmAlertbtn = $x("//button[@id='confirmButton']");
    private final SelenideElement promtAlertbtn = $x("//button[@id='promtButton']");


    public void AlertHandleings(){
        SlectAert.should(Condition.visible,Duration.ofSeconds(10)).click();
        selectAlertbtn.should(Condition.visible,Duration.ofSeconds(10)).click();
        Alertoptbtn.click();
        SimpleAlertbtn.should(Condition.visible,Duration.ofSeconds(10)).click();
        switchTo().alert().accept();
        waitAlertbtn.should(Condition.visible,Duration.ofSeconds(10)).click();
        switchTo().alert(Duration.ofSeconds(6)).accept();
        confirmAlertbtn.should(Condition.visible,Duration.ofSeconds(10)).click();
        switchTo().alert().dismiss();
        promtAlertbtn.should(Condition.visible,Duration.ofSeconds(10)).click();
        switchTo().alert().sendKeys("okay");

    }
}
