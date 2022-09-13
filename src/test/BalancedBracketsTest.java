package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketReturnsTrue2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Brackets]"));
    }

    @Test
    public void onlyBracketsReturnsTrue3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Parenthesis[Brackets]"));
    }

    @Test
    public void onlyBracketsReturnsTrue4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]EmptyBracket"));
    }

    @Test
    public void onlyBracketsReturnsTrue5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void nonBalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void nonBalancedBracketsReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LeftBracket"));
    }
    @Test
    public void nonBalancedBracketsReturnsFalse3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Brackets]Fighting["));
    }
    @Test
    public void nonBalancedBracketsReturnsFalse4() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

}