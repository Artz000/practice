package ru.ssau.tk.functions;

import static org.junit.jupiter.api.Assertions.*;

public class SinFunctionTest{
    @org.junit.jupiter.api.Test
    public void testApply() {
        SinFunction x = new SinFunction();
        assertEquals(x.apply(45), 1.0);
    }
}