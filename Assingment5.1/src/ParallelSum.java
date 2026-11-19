
import java.util.Random;

public class ParallelSum {

    public static void main(String[] args) {

        int size = 100000;
        int[] numbers = new int[size];

        Random random = new Random();

        //  random numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }

        // check available CPU cores
        int cores = Runtime.getRuntime().availableProcessors();

        System.out.println("Available CPU cores: " + cores);

        // divide array into portions
        Thread[] threads = new Thread[cores];
        long[] partialSums = new long[cores];

        int portion = size / cores;

        for (int i = 0; i < cores; i++) {

            final int threadIndex = i;
            final int start = i * portion;

            final int end = (i == cores - 1)
                    ? size
                    : start + portion;

            threads[i] = new Thread(() -> {

                long sum = 0;

                for (int j = start; j < end; j++) {
                    sum += numbers[j];
                }

                partialSums[threadIndex] = sum;

                System.out.println(
                        "Thread " + threadIndex +
                                " calculated: " + sum
                );
            });

            threads[i].start();
        }

        // Wait for all threads
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                return;
            }
        }

        // Calculate final sum
        long totalSum = 0;

        for (long sum : partialSums) {
            totalSum += sum;
        }

        System.out.println("Total sum: " + totalSum);
    }
}
