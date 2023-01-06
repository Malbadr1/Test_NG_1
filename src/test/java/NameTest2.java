import org.testng.Assert;
import org.testng.annotations.*;

public class NameTest2 extends Main {

@BeforeClass
public void beforeClass(){
    System.out.println(" Iam in a before class 2");
}
@AfterClass
public void afterClass(){
    System.out.println(" Iam in a after class");
}
    @BeforeMethod
public  void beforeMethod(){
        System.out.println(" Iam in a before Method ");
    }
    @AfterMethod

    public  void afterMethod(){
        System.out.println("  Iam in a after Method ");
    }
    @Test(groups = "M")
    public void Should_return_Name_if_contain_special_charachter(){
        System.out.println("The first case");
        String actualResult= Name.checkName("Ali@");
        String expectedResult= "User";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test(groups = {"L","M"})
    public void a_Should_return_Name_if_not_contain_special_charachter(){
        System.out.println("The 3d case");
        String actualResult= Name.checkName("Ali");
        String expectedResult="Ali";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
