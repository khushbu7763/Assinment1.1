
import java.util.Scanner;


public class Primenumbergenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter start: ");
    int start = scanner.nextInt();

        System.out.print("Enter end: ");
    int end = scanner.nextInt();

        for (int n = start; n <= end; n++) {
        boolean prime = true;

        if (n < 2) {
            prime = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(n);
        }
    }

        scanner.close();
}
}
