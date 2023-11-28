package ru.ssau.tk.functions;

import static org.junit.jupiter.api.Assertions.*;
public class SqrFunctionTest  {
    @org.junit.jupiter.api.Test
    public void testApply() {
        SqrFunction a = new SqrFunction();
        assertEquals(a.apply(2), 4);
    }
}