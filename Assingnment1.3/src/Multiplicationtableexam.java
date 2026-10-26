import java.util.Scanner;


public class Multiplicationtableexam {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int score = 0;

    while (score < 10) {
        score = 0;

        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 10) + 1;
            int b = (int) (Math.random() * 10) + 1;

            System.out.print(a + " * " + b + " = ");
            int answer = scanner.nextInt();

            if (answer == a * b) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("Your score: " + score + "/10");

        System.out.println("Congratulations! you mastered the multiplication tables!");
        scanner.close();
    }
}
}
