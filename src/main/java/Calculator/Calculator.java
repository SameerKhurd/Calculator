package Calculator;
import java.io.IOException;

public class Calculator  {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    // Added Multiply and Divide functionality
    public long multiply(int x, int y) {
        return x * y;
    }

    public double divide(double x, double y) throws IOException {
        if (y == 0)
            throw new IllegalArgumentException("Cannot divide by '0'");

        return x / y;
    }


}