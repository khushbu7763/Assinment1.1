public class Bus extends AbstractVehicle {

    private String fuel;
    private int capacity;

    public Bus() {
        super("Bus", 5.0);
        fuel = "Diesel";
        capacity = 40;
    }

    @Override
    public String getInfo() {
        return "Type: " + vehicleType
                + "\nFuel: " + fuel
                + "\nCapacity: " + capacity + " passengers";
    }
}