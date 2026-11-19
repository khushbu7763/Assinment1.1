
public class OddEvenPrinter {

    public static void main(String[] args) {

        int start = 1;
        int end = 20;

        Thread oddThread = new Thread(() -> {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Thread: " + i);
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Thread: " + i);
                }
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Printing complete.");
    }
}
