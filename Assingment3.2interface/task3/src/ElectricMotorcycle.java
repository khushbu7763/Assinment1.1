public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle");
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\n" +
                "Type: Electric Motorcycle\n" +
                "Fuel: Electricity\n" +
                "Color: Green";
    }
}