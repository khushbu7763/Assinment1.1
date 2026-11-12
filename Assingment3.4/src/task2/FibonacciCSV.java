package task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {

    public static void main(String[] args) {

        long first = 0;
        long second = 1;

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("fibonacci.csv"))) {

            writer.write("Number,Fibonacci");
            writer.newLine();

            for (int i = 0; i < 60; i++) {

                long next = first + second;
                first = second;
                second = next;

                writer.write((i + 1) + "," + first);
                writer.newLine();}

            System.out.println("Fibonacci CSV file created successfully!");}
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());}
    }
}
