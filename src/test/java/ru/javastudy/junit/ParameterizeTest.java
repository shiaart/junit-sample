package ru.javastudy.junit;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


/**
 * Created by retinka on 13.01.2016.
 */
@RunWith(Parameterized.class)

public class ParameterizeTest {
    private int valueA;
    private int valueB;
    private int expected;

    public ParameterizeTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 6, 8},
                {18, 2, 20},
                {13, 15, 28},
                {1, 5, 6}
        });
    }

    @Test
    public void paramTest() {
//        assertEquals(expected, new Calculator().getSum(valueA,valueB));
    }
}