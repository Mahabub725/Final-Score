package PageObject;

public class Homepage {
    public static String signInLink = "//*[@id=\"app\"]/div/header/nav[1]/div/button";
    public static String emailField = "body > div:nth-child(14) > div > div > div > form > div.c-email-form > div > label > input[type=\"EMAIL\"]";
    public static String passwordField = "body > div:nth-child(14) > div > div > div > form > div.c-password-form > div > label > input[type=\"PASSWORD\"]";
    public static String signInButton = "/html/body/div[9]/div/div/div/form/div[4]/div[2]/button";

    public static String searchField = "//*[@id=\"typeahead\"]";

    public static String menField = "/html/body/div[5]/div/div/div/div/div[2]/div/nav/ul/li[1]/button";
    public static String womenField = "/html/body/div[5]/div/div/div/div/div[2]/div/nav/ul/li[2]/button";
    public static String kidsField = "/html/body/div[5]/div/div/div/div/div[2]/div/nav/ul/li[3]/button";
    public static String brandsField = "/html/body/div[5]/div/div/div/div/div[2]/div/nav/ul/li[4]/button";




    //    test case 01(dep)
    public static String dep = "//*[@id=\"nav-link-shopall\"]/span[2]";
    public static String prime = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[1]/span";
    public static String all = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[1]/div[1]/div/a[1]/span[1]";

    // test case 02()
    public static String todays_deal = "//*[@id=\"nav-xshop\"]/a[2]";
    public static String amazon_deals = "//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/input";

    //    test case 03
    public static String search = "//*[@id=\"twotabsearchtextbox\"]";
    public static String click = "//*[@id=\"nav-search\"]/form/div[2]/div/input";

    //    test case 04
    public static String cart = "//*[@id=\"nav-cart\"]/span[2]";
    public static String checkout = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input";

    //test case 05
    public static String get_text = "//*[@id=\"navFooter\"]/div[5]/ul/li[4]";




}

