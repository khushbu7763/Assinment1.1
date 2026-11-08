public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car");
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\n" +
                "Type: Electric Car\n" +
                "Fuel: Electricity\n" +
                "Color: Blue";
    }
}