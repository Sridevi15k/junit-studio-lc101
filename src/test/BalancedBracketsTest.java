package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    /*@Test
    public void emptyTest() {
        assertEquals(true, true);
    }*/
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringsWithBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringsWithNoBalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        //assertFalse(BalancedBrackets.hasBalancedBrackets("]["));s
    }

    @Test
    public void stringsWithBracketsInMiddleReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void stringsWithBracketsAtStartReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringsWithBracketsEmptyReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringsWithBracketsAtEndReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void stringsWithBracketsAtStartAndMiddleReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }

    @Test
    public void stringsWithNoBalancedBracketsDoubleEndMissingStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code]"));
    }

    @Test
    public void stringsWithNoBalancedBracketsMissingEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void stringsWithNoBalancedBracketsMultipleEndNoStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void stringsWithNoBalancedBracketsSingleEndNoStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringsWithNoBalancedBracketsNoStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void stringsWithNoBalancedBracketsNoEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code["));
    }
}
