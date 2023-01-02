import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Cases {
    @Test
    public void Should_return_Name_if_contain_special_charachter(){
        System.out.println("The first case");
        String actualResult= Name.checkName("Ali@");
        String expectedResult= "User";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void Should_return_Name_if_contain_special_charachter2(){
        System.out.println("The 2d case");
    }
    @Test
    public void Should_return_Name_if_not_contain_special_charachter(){
        System.out.println("The 3d case");
    }
}
