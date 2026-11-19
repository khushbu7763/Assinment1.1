
public class ThreadSafeListTest {

    public static void main(String[] args) {

        // create a thread-safe list
        ThreadSafeList list = new ThreadSafeList();

        // create three threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.addElement("Apple");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.addElement("Banana");
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.addElement("Orange");
            }
        });

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        // wait for all threads
        try {
            thread1.join();
            thread2.join();
            thread3.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted.");
            return;
        }

        // display total elements
        System.out.println("Total elements: " + list.getSize());

        // remove one apple
        list.removeElement("Apple");

        // display size after removal
        System.out.println("After removal: " + list.getSize());
    }
}
