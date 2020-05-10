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

    // Added Multiply and Divide Test functionality
    @Test
    public void testMultiply() {
        int x = 40;
        int y = 10;
        long expectedResult = 400;
        long result = calculator.multiply(x, y);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testDivide() {
        int x = 88;
        int y = 10;
        double expectedResult = 8.8;
        double result = 0;
        try {
            result = calculator.divide(x, y);
        }catch (Exception e){

        }
        Assert.assertEquals(expectedResult, result,0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() throws IOException {
        int a = 15;
        int b = 0;
        calculator.divide(a, b);
    }

}