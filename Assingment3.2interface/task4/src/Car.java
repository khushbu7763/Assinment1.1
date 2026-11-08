public class Car extends AbstractVehicle {

    private String fuel;
    private String color;

    public Car() {
        super("Car", 25.0);
        fuel = "Petrol";
        color = "Red";
    }

    @Override
    public String getInfo() {
        return "Type: " + vehicleType
                + "\nFuel: " + fuel
                + "\nColor: " + color;
    }
}