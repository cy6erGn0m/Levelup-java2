package ru.levelup.j2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sum1() {
        if (Main.sum(1, 2) != 3) {
            fail("Sum of 1 and 2 should be 3");
        }
    }

    @Test
    public void sum2() {
    }

    @Test
    public void sum3() {
    }
}
