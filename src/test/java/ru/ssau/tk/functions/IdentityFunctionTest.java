package ru.ssau.tk.functions;


import static org.junit.jupiter.api.Assertions.*;

public class IdentityFunctionTest  {
    @org.junit.jupiter.api.Test
    void apply() {
        IdentityFunction x = new IdentityFunction();
        assertEquals(x.apply(10), 10);
    }
}