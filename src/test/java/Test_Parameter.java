import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Parameter {
    @Parameters({"browser","version"})
    @Test
    public static void Open_Site(String browser,String version){
        System.out.println("Open"+browser+"   browser and version"+version);
    }
}
