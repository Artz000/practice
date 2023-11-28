package ru.ssau.tk.functions;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinFunctionTest extends TestCase {
    @org.junit.jupiter.api.Test
    public void testApply() {
        SinFunction x = new SinFunction();
        assertEquals(x.apply(45), 1.0);
    }
}