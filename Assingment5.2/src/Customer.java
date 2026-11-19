
public class Customer implements Runnable {

    private TicketReservation reservation;
    private int customerId;
    private int tickets;

    public Customer(TicketReservation reservation, int customerId, int tickets) {
        this.reservation = reservation;
        this.customerId = customerId;
        this.tickets = tickets;
    }

    @Override
    public void run() {

        boolean success = reservation.reserveTickets(tickets);

        if (success) {
            System.out.println("Customer " + customerId +
                    " reserved " + tickets + " tickets.");
        } else {
            System.out.println("Customer " + customerId +
                    " couldn't reserve " + tickets + " tickets.");
        }
    }
}
