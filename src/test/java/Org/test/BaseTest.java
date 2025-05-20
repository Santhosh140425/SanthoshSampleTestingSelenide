package Org.test;

import com.codeborne.selenide.Configuration;
import org.base.BaseClass;
import org.pages.AmzHomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest extends BaseClass {

    @Test
    public void BeforeExecute(){
        open("https://rahulshettyacademy.com/client");

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
}
