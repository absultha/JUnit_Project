package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(ParameterProvideClass.class)
public class JunitWithParameterClass {
	@Test
	@DisplayName("Positive Test")
	public void test1(String param1) {
		assertFalse(StringFunctions.isPlaindrome("param1"));
	}
}
