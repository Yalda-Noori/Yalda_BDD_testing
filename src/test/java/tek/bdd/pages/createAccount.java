package tek.bdd.pages;

import org.openqa.selenium.By;

public class createAccount {
public final static By pageTitle=By.xpath("//div[1]/div/div[2]/div/div/div/h2");

public final static By EmailAddress= By.xpath("//div/form/div/div[1]/div[1]/input");

public final static By FirstName=By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[3]/input");

public final static By Gender= By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[5]/div/select");

public final static By EmploymentStatus=By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[7]/input");

public final static By Title=By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[2]/div/select");

public final static By LastName=By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[4]/input");

public final static By MaritalStatus=By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[6]/div/select");

public final static By DateOfBirth=By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[8]/input");

public final static By CreateAccountButton=By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]");



public final static By Email=By.xpath("//div[1]/div/div[2]/div/div/div/h2[3]");
public final static By Error=By.xpath("//div[contains(text(), 'ERROR')]");

}
