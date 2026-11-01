
public class Bus extends Carclass {

    private int passengers;
    private int maxPassengers;

    public Bus(String typeName, int maxPassengers) {
        super(typeName);
        this.maxPassengers = maxPassengers;
        passengers = 0;
    }

    public void passengerEnter() {
        if (passengers < maxPassengers) {
            passengers++;
            System.out.println("Passenger entered. Total passengers: " + passengers);
        } else {
            System.out.println("Bus is full!");
        }
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
            System.out.println("Passenger exited. Total passengers: " + passengers);
        } else {
            System.out.println("Bus is empty!");
        }
    }

    public int getPassengers() {
        return passengers;
    }
}
