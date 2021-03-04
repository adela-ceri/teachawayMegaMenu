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

        wait.until(ExpectedConditions.elementToBeClickable(Constants.CLOSE_MODAL_BTN)).click();

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


        // Verify JOBS Secondary Menu

        action.moveToElement(driver.findElement(Constants.JOBS)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Constants.JOBS_SECONDARY_MENU)));
        List<WebElement> jobs_second_menu = driver.findElements(Constants.JOBS_SECONDARY_MENU);

        Assert.assertEquals(jobs_second_menu.size(), secondary_menu_element);

        for(int i=0; i<jobs_second_menu.size(); i++) {
            Assert.assertEquals(jobs_second_menu.get(i).getText(), JOBS_Second_Menu.get(i));
        }

        //Verify TEFL Secondary Menu

        action.moveToElement(driver.findElement(Constants.TEFL)).perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Constants.TEFL_SECONDARY_MENU)));
        List<WebElement> tefl_second_menu = driver.findElements(Constants.TEFL_SECONDARY_MENU);

        Assert.assertEquals(tefl_second_menu.size(), tefl_secondary_element);

        for(int i=0; i<tefl_second_menu.size(); i++) {
            Assert.assertEquals(tefl_second_menu.get(i).getText(), TEFL_Second_Menu .get(i));
        }

        //Verify TEACHER CERTIFICATION Secondary Menu

        action.moveToElement(driver.findElement(Constants.TEACHER)).perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Constants.TEACHER_CERTIFICATION_SECONDARY_MENU)));
        List<WebElement> teacher_second_menu = driver.findElements(Constants.TEACHER_CERTIFICATION_SECONDARY_MENU);

        Assert.assertEquals(teacher_second_menu.size(), teacher_secondary_element);

        for(int i=0; i<teacher_second_menu.size(); i++) {
            Assert.assertEquals(teacher_second_menu.get(i).getText(), TEACHER_Second_Menu .get(i));
        }
    }

}
