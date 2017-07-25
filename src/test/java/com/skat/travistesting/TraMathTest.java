package com.skat.travistesting;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Christian Palsig on 21-07-2017.
 */
class TraMathTest {
    TraMath math;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        math = new TraMath();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        math = null;
    }

    @org.junit.jupiter.api.Test
    void firstNumber() {
        assertEquals(math.firstNumber(), 3);
    }

    @org.junit.jupiter.api.Test
    void secondNumber() {
        assertEquals(math.secondNumber(), 34);
    }

    @org.junit.jupiter.api.Test
    void testOneHigher() {
        assertEquals(math.oneHigher(-1), 0);
        assertEquals(math.oneHigher(0), 1);
    }

}