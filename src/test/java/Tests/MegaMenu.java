package Tests;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Resources.Constants;
import java.util.List;

import static Resources.Data.MenuItems.*;

public class MegaMenu extends TestBase {

    @Test
    public void megaMenu(){

        wait.until(ExpectedConditions.presenceOfElementLocated(Constants.MENU));

        // Verify Logo
        Boolean logoIsDisplayed = wait.until(ExpectedConditions.visibilityOf(driver.findElement(Constants.LOGO))).isDisplayed();
        Assert.assertTrue(logoIsDisplayed);

        // Verify Login and Register Buttons
        Boolean loginBtnIsDisplayed = wait.until(ExpectedConditions.visibilityOf(driver.findElement(Constants.LOGIN_BTN))).isDisplayed();
        Assert.assertTrue(loginBtnIsDisplayed);
        Assert.assertEquals(driver.findElement(Constants.LOGIN_BTN).getText(),loginText);

        Boolean registerBtnIsDisplayed = wait.until(ExpectedConditions.visibilityOf(driver.findElement(Constants.REGISTER_BTN))).isDisplayed();
        Assert.assertTrue(registerBtnIsDisplayed);
        Assert.assertEquals(driver.findElement(Constants.REGISTER_BTN).getText(),registerText);

        // Verify Main Menu Elements

        List<WebElement> main_menu = driver.findElements(Constants.MAIN_MENU);

        //Verify Numbers of Elements in the Main Menu
        Assert.assertEquals(main_menu.size(), main_menu_element);

        for(int i=0; i<main_menu.size(); i++) {
                Assert.assertEquals(main_menu.get(i).getText(), Main_Menu_Elements.get(i));
        }
    }
}
