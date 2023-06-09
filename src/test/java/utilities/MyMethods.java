package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class MyMethods {


    public WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(10));

    public void sendKeysMethod(WebElement element, String keys) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
     js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }
    public void verifyContainsText(WebElement element, String text){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(text));

    }
    public void verifyContainsTextInList(List<WebElement> list, String text){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(list.get(0).getText(), text);
    }
    public void verifyNotContainsTextInList(List<WebElement> list, String text){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertNotEquals(list.get(0).getText(), text);
    }


}
