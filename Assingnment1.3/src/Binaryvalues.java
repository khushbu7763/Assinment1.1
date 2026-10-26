import java.util.Scanner;


public class Binaryvalues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a binary number 0 and 1 : ");
        String name = scanner.nextLine();

        int decimal = 0;

        for (int i = 0; i < name.length(); i++) {
            decimal = decimal * 2 + (name.charAt(i) - '0');
        }

        System.out.println("Decimal: " + decimal);
    }


}
