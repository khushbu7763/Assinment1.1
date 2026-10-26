import java.util.Scanner;


public class Quadraticequation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the coefficients of a quadratic equation ");
        System.out.print("enter coefficient a: ");
        double a = scanner.nextDouble();


        System.out.println("enter coefficient b:");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();


        //ax2+bx+c equation
        //formula x= -b+_sqrt b*b-4ac/2a
        double x = b*b - 4*a*c;
        if (x < 0) {
            System.out.println("No real roots");
        } else {
            System.out.println((-b + Math.sqrt(x)) / (2*a));
            System.out.println((-b - Math.sqrt(x)) / (2*a));
        }








    }

}
