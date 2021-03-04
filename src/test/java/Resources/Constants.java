package Resources;

import org.openqa.selenium.By;

public class Constants {
    public static By MENU = By.xpath("/html/body/div[2]/nav/div");
    public static By LOGO = By.xpath("/html/body/div[2]/nav/div/a/img");
    public static By LOGIN_BTN = By.id("login");
    public static By REGISTER_BTN = By.id("register");
    public static By CLOSE_MODAL_BTN = By.xpath("//button[@class='ub-emb-close']");
    public static By MAIN_MENU = By.xpath("//*[@id=\"block-mainnavigation-2\"]/div/div/div/ul/li");
    public static By JOBS_SECONDARY_MENU = By.xpath("//*[@id=\"tb-megamenu-column-1\"]/div/ul/li");
    public static By TEFL_SECONDARY_MENU = By.xpath("//*[@id=\"tb-megamenu-column-10\"]/div/ul/li");
    public static By TEACHER_CERTIFICATION_SECONDARY_MENU = By.xpath("//*[@id=\"tb-megamenu-column-11\"]/div/ul/li");
    public static By JOBS = By.xpath("//*[@data-label=\"Jobs\"]");
    public static By TEFL = By.xpath("//*[@data-label=\"Tefl\"]");
    public static By TEACHER = By.xpath("//*[@data-label=\"Teacher Certification\"]");

}
