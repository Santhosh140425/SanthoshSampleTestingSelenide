package org.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class BaseClass {

    public static void sendKeys(SelenideElement s,String value){
        s.setValue(value);
    }
    public static void click(SelenideElement e){
        e.click();
    }
    public static void implicitlyWait(SelenideElement el,long secs){
    el.should(Condition.visible, Duration.ofSeconds(secs));
    }
    public static String gatAttribute (SelenideElement e){
      String st=  e.getAttribute("value");
        return st;
    }
    public static String getText(SelenideElement e){
       String s= e.getText();
        return s;
    }
    public static void moveToElemet(SelenideElement target){
        actions().moveToElement(target).build().perform();
    }
    public static void dragAndDrop(SelenideElement source, SelenideElement target){
        actions().dragAndDrop(source,target).build().perform();
    }
    public static void contextClick(SelenideElement target){
        actions().contextClick(target);
    }
    public static void doubleClcick(){
        actions().doubleClick().perform();
    }
    public static void Switchwindow(Integer index){
        switchTo().window(index);
    }
    public static void closewebdriver(){closeWebDriver();}



    }
