package ru.mycarrental.selectCarPageLocators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelectCarPage {

    private SelenideElement selectFirstCarInList;
    private SelenideElement selectCarPageFirstCarInListPayForDayWithDiscount;

    private SelenideElement selectCarPageErrMessRentPeriodLowerThanThreeDays;
    private SelenideElement selectCarPageErrMessZeroCarsFound;
    private SelenideElement selectCarPageErrFirstCalendarSurroundRed;

    public SelectCarPage() {
        this.selectFirstCarInList = $("[class=\"search-result-mobile-box\"]");
        this.selectCarPageFirstCarInListPayForDayWithDiscount = $("[class=\"search-result-mobile-price\"] [class=\"ng-binding\"]");

        this.selectCarPageErrMessZeroCarsFound = $("[class=\"search-result-title ng-binding\"]");
        this.selectCarPageErrMessRentPeriodLowerThanThreeDays = $("#swal2-content");
        this.selectCarPageErrFirstCalendarSurroundRed = $("[class=\"left-form-field flex error\"]");

    }

    public SelectCarPage selectFirstCarFromList() {
        System.out.println("select first car from Select-List");
        selectFirstCarInList.click();
        return new SelectCarPage();
    }

    public String selectCarPagePriceForDayWithDiscount() {
        return selectCarPageFirstCarInListPayForDayWithDiscount.getText();
    }

    public SelenideElement selectCarPageErrMessRentPeriodLowerThanThreeDays() {
        return selectCarPageErrMessRentPeriodLowerThanThreeDays;
    }

    public String getSelectCarPageErrMessZeroCarsFound() {
        return selectCarPageErrMessZeroCarsFound.getText();
    }

    public SelenideElement getSelectCarPageErrFirstCalendarSurroundRed() {
        return selectCarPageErrFirstCalendarSurroundRed;
    }
}
