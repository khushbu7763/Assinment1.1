public class ElectricMotorcycle extends AbstractVehicle {

    private String fuel;
    private String color;

    public ElectricMotorcycle() {
        super("Electric Motorcycle", 0.08);
        fuel = "Electricity";
        color = "Green";
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