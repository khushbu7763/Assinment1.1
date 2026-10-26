import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int[] uniqueNumbers = new int[size];
        int uniqueSize = 0;

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            boolean found = false;

            for (int j = 0; j < uniqueSize; j++) {
                if (numbers[i] == uniqueNumbers[j]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                uniqueNumbers[uniqueSize] = numbers[i];
                uniqueSize++;
            }
        }

        System.out.println("The array without duplicates:");

        for (int i = 0; i < uniqueSize; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }

        System.out.println();
    }
}
