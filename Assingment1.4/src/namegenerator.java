import java.util.Scanner;
import java.util.Random;



public class namegenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] firstNames = {
                "Pinkey", "Khush", "Riya", "Shivani", "Raj"

        };

        String[] lastNames = {
                "Singh", "Yadav", "Punia", "Kumari", "Rawat"
        };
        System.out.print("How many random names? ");
        int size = input.nextInt();

        for (int i = 0; i < size; i++) {
            int firstIndex = random.nextInt(firstNames.length);
            int lastIndex = random.nextInt(lastNames.length);

            System.out.println(firstNames[firstIndex] + " "
                    + lastNames[lastIndex]);
        }
    }


    }

