package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.Tele2.Settings;

import static com.codeborne.selenide.Selenide.switchTo;

/**
     * PageObject для Chrome
     */

    public class SearchPage extends Settings {

@FindBy(xpath = "//div[contains(@class,'settings-link')][1]")
    private WebElement tariffSetUpButtonColection;

@FindBy(xpath = "//div[contains(@class,'iconed-services-group')]//div[contains(@class,'item')]/img")
    private WebElement servicesCollection;

@FindBy(xpath = "//div[contains(@class,'PushTip-close')]")
    private WebElement closeTip;

public void tariffSetUpButtonColection() throws InterruptedException {
    tariffSetUpButtonColection.click();
    Thread.sleep(3000);
}

public void closeTip() throws InterruptedException {

  switchTo().frame("fl-241715").findElement((By) closeTip).click();
  Thread.sleep(3000);
    switchTo().parentFrame();

}

public void servicesCollection() throws InterruptedException {
    servicesCollection.click();
    Thread.sleep(3000);
}


    }

