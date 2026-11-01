
public class BusMain {
    public static void main(String[] args) {

        Bus bus = new Bus("City Bus", 3);

        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();

        bus.passengerExit();

        System.out.println("Passengers in bus: " + bus.getPassengers());
    }
}


