package PageObject;

public class HomePageObj {
    public static String signInLink = "//*[@id=\"app\"]/div/header/nav[1]/div/button";
    public static String emailField = "body > div:nth-child(14) > div > div > div > form > div.c-email-form > div > label > input[type=\"EMAIL\"]";
    public static String passwordField = "body > div:nth-child(14) > div > div > div > form > div.c-password-form > div > label > input[type=\"PASSWORD\"]";
    public static String signInButton = "/html/body/div[9]/div/div/div/form/div[4]/div[2]/button";

    public static String searchField = "//*[@id=\"typeahead\"]";

    public static String menField = "/html/body/div[5]/div/div/div/div/div[2]/div/nav/ul/li[1]/button";
    public static String womenField = "/html/body/div[5]/div/div/div/div/div[2]/div/nav/ul/li[2]/button";
    public static String kidsField = "/html/body/div[5]/div/div/div/div/div[2]/div/nav/ul/li[3]/button";
    public static String brandsField = "/html/body/div[5]/div/div/div/div/div[2]/div/nav/ul/li[4]/button";


}
