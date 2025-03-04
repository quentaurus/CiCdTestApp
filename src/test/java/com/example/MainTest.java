package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testHelloMessage() {
        assertEquals("Hello, Java Desktop Application!", Main.getHelloMessage());
    }
}
