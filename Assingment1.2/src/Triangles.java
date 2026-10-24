import java.util.Scanner;


public class Triangles {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter length of right triangle:");
        double length = reader.nextDouble();

        System.out.println("Enter base of right triangle: ");
        double base = reader.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(length,2)+Math.pow(base,2));

        System.out.println("length of hypotenuse is: " + hypotenuse);

        reader.close();





    }

}
