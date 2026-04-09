
package com.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testArithmetic() {
        assertEquals(15, 10 + 5);
        assertEquals(50, 10 * 5);
    }
    
    @Test
    public void testEvenOdd() {
        assertTrue(10 % 2 == 0);  // Even
        assertTrue(15 % 2 != 0);  // Odd
    }
}