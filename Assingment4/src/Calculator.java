public class Calculator {

    private int value = 0;

    // Reset calculator to zero
    public void reset() {
        value = 0;
    }

    // Add one positive integer
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "Negative numbers are not allowed"
            );
        }

        value = value + number;
    }

    // Return current calculator value
    public int getValue() {
        return value;
    }

    // Add multiple positive integers
    public void sum(int... numbers) {
        for (int number : numbers) {
            add(number);
        }
    }
}