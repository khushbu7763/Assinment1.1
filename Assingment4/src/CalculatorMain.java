public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Add integers
        calculator.add(10);
        calculator.add(20);
        calculator.add(30);

        System.out.println("Current value: "
                + calculator.getValue());

        // Reset calculator
        calculator.reset();

        System.out.println("After reset: "
                + calculator.getValue());

        // Add multiple integers
        calculator.sum(5, 10, 15);

        System.out.println("After sum: "
                + calculator.getValue());
    }
}