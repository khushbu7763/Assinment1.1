import java.util.Scanner;


public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter temp in Fahrenheit");

        double fahrenheit = Double.parseDouble(reader.nextLine());
        FahrenheitToCelsius converter = new FahrenheitToCelsius();
        converter.convert(fahrenheit);

        reader.close();

    }

    public double convert(double fahrenheit) {

        // °C = (°F - 32) × 5/9 formula
        double Celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("Temperature in Celsius: %.1f%n", Celsius);
        return Celsius;
    }
}