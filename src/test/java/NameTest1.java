import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NameTest1 extends Main {
@BeforeMethod (groups = {"L","M"})
public void beforeMethod(){
    System.out.println(" Iam in a after Method");

}
@AfterMethod
public void afterMethod(){
    System.out.println(" Iam in a before Method");
}
    @Test(groups = "M")
    public void Should_return_Name_if_contain_special_charachter2(){
        System.out.println("The 2d case");
        String actualResult= Name.checkName("Ali!");
        String expectedResult="User";
        Assert.assertSame(actualResult,expectedResult);
    }
}
