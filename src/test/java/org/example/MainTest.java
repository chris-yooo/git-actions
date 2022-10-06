package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void sumTest() {
        int value1 = 10;
        int value2 = 5;

        int actual = Main.sum(value1, value2);
        assertEquals(15, actual);
    }
}