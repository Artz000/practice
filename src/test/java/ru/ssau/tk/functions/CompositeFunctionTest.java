package ru.ssau.tk.functions;

import static org.junit.jupiter.api.Assertions.*;

public class CompositeFunctionTest {
    @org.junit.jupiter.api.Test
    void testSqrSinFunc(){
        SqrFunction f1 = new SqrFunction();
        SinFunction f2 = new SinFunction();
        CompositeFunction c = new CompositeFunction(f1,f2);
        assertEquals(c.apply(15), 1,0.000001);
    }

    @org.junit.jupiter.api.Test
    void testSinSqrFunc(){
        SqrFunction f1 = new SqrFunction();
        SinFunction f2 = new SinFunction();
        CompositeFunction c = new CompositeFunction(f2,f1);
        assertEquals(c.apply(15), 0.25,0.000001);
    }

}