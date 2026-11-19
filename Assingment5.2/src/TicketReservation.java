
public class TicketReservation {

    private int availableSeats;

    public TicketReservation(int totalSeats) {
        availableSeats = totalSeats;
    }

    public synchronized boolean reserveTickets(int tickets) {

        if (tickets <= availableSeats) {

            availableSeats = availableSeats - tickets;

            return true;

        } else {

            return false;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
