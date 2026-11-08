public class ElectricCar extends AbstractVehicle {

    private String fuel;
    private String color;

    public ElectricCar() {
        super("Electric Car", 0.18);
        fuel = "Electricity";
        color = "Blue";
    }

    @Override
    public void charge() {
        System.out.println(vehicleType + " is charging...");
    }

    @Override
    public String getInfo() {
        return "Type: " + vehicleType
                + "\nFuel: " + fuel
                + "\nColor: " + color;
    }
}