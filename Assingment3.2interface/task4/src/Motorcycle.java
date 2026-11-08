public class Motorcycle extends AbstractVehicle {

    private String fuel;
    private String color;

    public Motorcycle() {
        super("Motorcycle", 50.0);
        fuel = "Gasoline";
        color = "Black";
    }

    @Override
    public String getInfo() {
        return "Type: " + vehicleType
                + "\nFuel: " + fuel
                + "\nColor: " + color;
    }
}