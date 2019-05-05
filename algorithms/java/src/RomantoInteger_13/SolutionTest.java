package RomantoInteger_13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {

        String romanSymbol1 = "LVIII";
        String romanSymbol2 = "MCMXCIV";

        int romanValue = Solution.romanToInt(romanSymbol2);
        System.out.println("romanValue: " + romanValue);


    }
}