public class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("Motorcycle");
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\n" +
                "Type: Motorcycle\n" +
                "Fuel: Gasoline\n" +
                "Color: Black";
    }
}