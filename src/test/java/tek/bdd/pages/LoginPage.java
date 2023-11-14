package tek.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {
   public final static By LoginButton=By.xpath("//div[1]/div/div[1]/div/a[2]");

   public final static By UserName=By.xpath("//div[1]/div/div[2]/div/div/div/div/form/div/div[1]/input");

    public final static By Password=By.xpath("//div[1]/div/div[2]/div/div/div/div/form/div/div[2]/div[1]/input");

    public final static By SignIn=By.xpath("//div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");

    public final static By CustomerService=By.xpath("//div[1]/div/div[1]/div/h2");

    public final static By Error=By.xpath("//div[1]/div/div[2]/div/div/div/div/div");
}
