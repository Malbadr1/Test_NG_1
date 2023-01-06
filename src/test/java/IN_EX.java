import org.testng.Assert;
import org.testng.annotations.Test;

public class IN_EX {
    @Test
    public void Let_return_Name_if_contain_special_charachter(){
        System.out.println("The first case");
        String actualResult= Name.checkName("Ali@");
        String expectedResult= "User";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void be_Should_return_Name_if_not_contain_special_charachter(){
        System.out.println("The 3d case");
        String actualResult= Name.checkName("Ali");
        String expectedResult="Ali";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void A(){
        System.out.println("The 3d case");
        String actualResult= Name.checkName("Ali");
        String expectedResult="Ali";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
