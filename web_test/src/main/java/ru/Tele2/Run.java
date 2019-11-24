package ru.Tele2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;


public class Run extends Settings {

        @Test
        public void SearchPage() throws InterruptedException {


            pages.SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

            driver.manage().window().maximize();

            searchPage.tariffSetUpButtonColection();

            //Проверка URL страницы на соответствие
            Assert.assertTrue(driver.getCurrentUrl().equals("https://msk.tele2.ru/nastroy-tariff#sliders"));
            Thread.sleep(5000);


            //Проверка цены тарифа на соответствие
            String priceForTarriff = "//div[contains(@class,'hidden-xs')]//span[contains(@class,'price')]";
            Assert.assertTrue(driver.findElement(By.xpath(priceForTarriff)).getText().equals("400"));
            Thread.sleep(3000);

            //Закрываем высплывающее окно на странице
            searchPage.closeTip();


            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("javascript:window.scrollBy(0,550)");

            searchPage.servicesCollection();

            Assert.assertTrue(driver.findElement(By.xpath(priceForTarriff)).getText().equals("550"));



        }
    }

