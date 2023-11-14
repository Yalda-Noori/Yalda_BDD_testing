package tek.bdd.pages;

import org.openqa.selenium.By;

public class PlanPage {
    public final static By PLANS_BUTTON = By.xpath("//div[2]/div/div/a[2]");

    public final static By PLANS_SECTION_TITLE = By.xpath("//div[3]/div/div/div/h2");

    public final static By PLAN_TABLE_HEADER_ROW = By.xpath("//div[1]/div/div[3]/div/div/div/div/table/thead/tr/th[2]");

    public static By getTablePlan4RowsData(int row, int column){
        return By.xpath("//table/body/tr["+row+"]/td["+column+"+]");
    }


}
