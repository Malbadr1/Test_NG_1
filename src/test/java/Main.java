import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Main {
    @BeforeSuite(groups = "M")
    public void beforeMethod(){
        System.out.println("lllllllllllllllllllllllll");

    }


}
