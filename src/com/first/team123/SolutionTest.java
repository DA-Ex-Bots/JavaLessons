package com.first.team123;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void fixedTests() {
        assertEquals("f", Solution.addLetters("a", "b", "c"));
        assertEquals("z", Solution.addLetters("z"));
        assertEquals("c", Solution.addLetters("a", "b"));
        assertEquals("c", Solution.addLetters("c"));
        assertEquals("a", Solution.addLetters("z", "a"));
        assertEquals("d", Solution.addLetters("y", "c", "b"));
        assertEquals("z", Solution.addLetters());
    }
}