package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class FlikartPage {

    private final SelenideElement search = $x("//input[@class='Pke_EE']");
    private final SelenideElement phone = $x("(//a[@class='oleBil'])[1]");
    private final ElementsCollection elements = $$(By.xpath("//div[@class='KzDlHZ']"));
    private final SelenideElement ele = $(By.xpath("//div[@class='F9+fd2']"));
    private final SelenideElement CheckBox = $x("(//div[@class='XqNaEv'])[1]");
    private final SelenideElement dropdown = $x("(//select[@class='Gn+jFg'])[2]");
    private final SelenideElement Selctprice = $x("//div[@class='tKgS7w']//option[@value='30000'][contains(text(),'₹30000')]");


    public void search() {
        search.setValue("iphone");
        sleep(3000);
        phone.shouldBe(Condition.visible).click();
    }

    public void ordertype() {
        List<String> productNames = new ArrayList<>();

        for (SelenideElement product : elements) {
            productNames.add(product.getText().trim());
        }
        List<String> ascending = new ArrayList<>(productNames);
        List<String> descending = new ArrayList<>(productNames);

        Collections.sort(productNames); // Ascending
        descending.sort(Collections.reverseOrder()); //Descending

        if (productNames.equals(ascending)) {
            System.out.println("The list is ascending");
        } else if (productNames.equals(descending)) {
            System.out.println("The list is decending");
        } else
            System.out.println("The list is not sorted");
    }

    public void reDirectingToHomePage() {
        ele.click();
    }
    public void Filter(){
        CheckBox.click();
        dropdown.click();
        Selctprice.click();

        sleep(4000);

    }

}


