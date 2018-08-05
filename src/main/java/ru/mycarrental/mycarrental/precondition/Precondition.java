package ru.mycarrental.mycarrental.precondition;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class Precondition extends InstanceForAllPages{


    @BeforeMethod
    protected void setUpMethod() {

        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "Chrome";
        Configuration.timeout = 10000;
        Configuration.browserSize = "375x1067";
        Selenide.open("http://mcr111.testing.place/");

    }

    @AfterClass
    public void quit() {
        Selenide.close();
    }
}

