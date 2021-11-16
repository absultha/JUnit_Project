package junits;

import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DynamicTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
public class DynamicTestExamples {
@TestFactory
	public Collection<DynamicTest>method1() {
	return Arrays.asList(
	DynamicTest.dynamicTest("Positive Test1",()->assertTrue(StringFunctions.isPlaindrome("oppo"))),
	DynamicTest.dynamicTest("Positive Test2",()->assertTrue(StringFunctions.isPlaindrome("madam"))),
	DynamicTest.dynamicTest("Negative Test",()->assertFalse(StringFunctions.isPlaindrome("abcd")))
	);
}



}
