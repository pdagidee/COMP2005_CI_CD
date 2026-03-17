package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorControllerTest {

    @Test
    void index() {
        int hours = 8;
        String expected = "Good morning" + "," + " " + "Daniel!";
        String actual = MessageGenerator2.messageGenerator2(hours);
        assertEquals(expected, actual);
    }
}