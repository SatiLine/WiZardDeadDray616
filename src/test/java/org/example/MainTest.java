package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testOne() {
        assertEquals("1", Main.TaskOne(1));
        assertEquals("fizz", Main.TaskOne(5));
        assertEquals("buzz", Main.TaskOne(7));
        assertEquals("fizzbuzz", Main.TaskOne(35));
    }

    @Test
    void testTwo() {
        assertEquals("dlrow olleh", Main.TaskTwo("hello world"));
    }

    @Test
    void testThree() {
        assertEquals("0.2928932188134524 1.7071067811865475", Main.TaskThree(2, -4, 1));
        assertEquals("Нет корней уравнения", Main.TaskThree(1, -4, 4));
    }

    @Test
    void testFour() {
        assertEquals(0.6101121094474383, Main.TaskFour(2, 1e-6));
    }

    @Test
    void testFive() {
        assertEquals(true, Main.TaskFive("акелакалека"));
    }
}