import java.util.Scanner;

public class Obsoletemeasures {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (g):");
        double grams = scanner.nextDouble();


        double luoti = grams / 13.28;

        int leiviska = (int) (luoti / (20 * 32));
        luoti = luoti - leiviska * 20 * 32;

        int naula = (int) (luoti / 32);
        luoti = luoti - naula * 32;

        System.out.printf(
                "%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti
        );

        scanner.close();




    }
}
