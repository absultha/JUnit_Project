package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionExamples {
@Test
public void test1() {
	String name1="Rohan";
	String name2="Rohan";
	assertEquals(name1,name2);
	String[] expectedArray= {"one","two","threee"};
	String[] resultArray= {"one","two","threee"};
	assertArrayEquals(expectedArray,resultArray);
	
}
}
