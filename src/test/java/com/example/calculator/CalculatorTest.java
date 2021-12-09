package com.example.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator c = null;

    @BeforeEach
    public void before () {
        this.c = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals (c.add(0.0,0.0), 0.0, 0.01);
    }
}
