package ReverseInteger;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {


    @Test
    public void reverseTest() {

        int example1 = 123;
        int example2 = -123;
        int example3 = 120;

        Assert.assertEquals(ReverseInteger.reverse(example1), 321);
        Assert.assertEquals(ReverseInteger.reverse(example2), -321);
        Assert.assertEquals(ReverseInteger.reverse(example3), 21);

        System.out.println(ReverseInteger.reverse(Integer.MAX_VALUE));
        System.out.println(ReverseInteger.reverse(Integer.MAX_VALUE + 222));

    }

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
