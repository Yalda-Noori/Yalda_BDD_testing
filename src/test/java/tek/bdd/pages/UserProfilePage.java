package tek.bdd.pages;

import org.openqa.selenium.By;

public class UserProfilePage{

    public final static By profileButton=By.xpath("/html/body/div[1]/div/div[1]/div/button");

    public final static By Status=By.xpath("//div[3]/div[3]/div/div/div/div/div/div[1]/p[2]/span");

    public final static By UserType=By.xpath("//div[3]/div[3]/div/div/div/div/div/div[2]/p[2]");

    public final static By Name=By.xpath("//div[3]/div[3]/div/div/div/div/div/div[3]/p[2]");

    public final static By Username=By.xpath("//div[3]/div[3]/div/div/div/div/div/div[4]/p[2]");

    public final static By Authorities=By.xpath("//div[3]/div[3]/div/div/div/div/div/div[5]/ul/li");

    public final static By logoutButton=By.xpath("//div[3]/div[3]/div/div/footer/div/button[1]");



}
