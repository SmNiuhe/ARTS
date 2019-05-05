package ValidParentheses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {

        Assert.assertTrue(ValidParentheses.isValid("()"));

    }


}