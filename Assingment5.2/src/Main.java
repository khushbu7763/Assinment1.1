public class Main {

    public static void main(String[] args) {

        // create a theatre with 10 available seats
        TicketReservation reservation = new TicketReservation(10);

        // Number of customers
        int numberOfCustomers = 15;

        // Create an array to store customer threads
        Thread[] customers = new Thread[numberOfCustomers];

        // Ticket requests for each customer
        int[] ticketRequests = {
                1, 2, 2, 3, 1,
                2, 1, 3, 1, 3,
                2, 4, 3, 1, 2
        };

        // Create and start customer threads
        for (int i = 0; i < numberOfCustomers; i++) {

            Customer customer = new Customer(
                    reservation,
                    i + 1,
                    ticketRequests[i]
            );

            customers[i] = new Thread(customer);

            customers[i].start();
        }

        // Wait for all customers to finish
        for (int i = 0; i < numberOfCustomers; i++) {

            try {
                customers[i].join();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted.");
                return;
            }
        }

        // Display remaining seats
        System.out.println("Remaining available seats: "
                + reservation.getAvailableSeats());
    }
}
