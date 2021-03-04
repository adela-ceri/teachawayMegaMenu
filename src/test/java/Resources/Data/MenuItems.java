package Resources.Data;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuItems {

    public static String loginText = "LOGIN";
    public static String registerText = "REGISTER";
    public static int main_menu_element = 5;
    public static int secondary_menu_element = 6;
    public static int tefl_secondary_element = 2;
    public static int teacher_secondary_element = 4;
    public  static ArrayList<String> Main_Menu_Elements = new ArrayList<>(Arrays.asList("JOBS", "TEFL", "TEACHER CERTIFICATION","COURSES","HIRE TEACHERS"));
    public static ArrayList<String> JOBS_Second_Menu = new ArrayList<>(Arrays.asList("Job Board", "Destinations", "Featured Programs","Job Openings","Teach in the US","Community"));
    public static ArrayList<String> TEFL_Second_Menu = new ArrayList<>(Arrays.asList("TEFL Courses", "TEFL Certification Guide" ));
    public static ArrayList<String> TEACHER_Second_Menu = new ArrayList<>(Arrays.asList("Teacher Certification Guide","Certification Programs","Hawai'i","Arizona" ));
}
