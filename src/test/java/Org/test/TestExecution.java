package Org.test;

import io.qameta.allure.Description;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.pages.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestExecution {

    @Test
    public void Login() {
        //Search text field
        //Button Click

        open("https://rahulshettyacademy.com/client");
        new LoginPage().login("santhosh12@mailto.plus", "User@123");
        new LoginPage().verifyLogin("Automation Practice");
    }

    @Test
    public void Home() {
        // Select Dropdown
        open("https://www.amazon.in/");
        AmzHomePage az = new AmzHomePage();
        try {
            az.invalidpageopen();
            az.Drop();
            System.out.println("Dropdown selection verified");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }


    @Test
    public void HandleAllert() {
        // Select Radio options
        // sleep(2000);
        open("https://demoqa.com/");
        Alertt alt = new Alertt();
        alt.Radiobtn();

    }

 //   @Test
    public void MultipleeAllert() {
        //Handling Alert popup
        open("https://demoqa.com/");
        MultipleAlerts mu = new MultipleAlerts();
        mu.AlertHandleings();

    }


    @Test
    public void Asc() {
        //ASC OR DSC orders
        open("https://www.flipkart.com/");
        FlikartPage flk = new FlikartPage();
        flk.search();
        flk.ordertype();
        //Filter
        flk.Filter();
        // ReDirect to Home Page
        flk.reDirectingToHomePage();
        sleep(3000);

    }


}
