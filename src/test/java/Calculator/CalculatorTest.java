package Calculator;

import org.junit.*;

import java.io.IOException;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void initialize() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int x = 25;
        int y = 50;
        int expectedResult = 75;
        long result = calculator.add(x, y);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testSubtract() {
        int x = 55;
        int y = 50;
        int expectedResult = 5;
        long result = calculator.subtract(x, y);
        Assert.assertEquals(expectedResult, result);;
    }
}