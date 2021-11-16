package junits;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AssumptionsExample {
@BeforeEach
public void setup() {
	System.setProperty("ENV","DEV");
}
@Test
public void test1() {
	String ExpectedEnv="DEV";
	String ActualEnv=System.getProperty("ENV");
	assumeTrue(ExpectedEnv.equals(ActualEnv));
	assertTrue(StringFunctions.isPlaindrome("oppo"));
}
}
