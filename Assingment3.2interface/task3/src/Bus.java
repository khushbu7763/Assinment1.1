public class Bus extends AbstractVehicle {

    public Bus() {
        super("Bus");
    }

    @Override
    public String getInfo() {
        return "Bus Information:\n" +
                "Type: Bus\n" +
                "Fuel: Diesel\n" +
                "Capacity: 40 passengers";
    }
}