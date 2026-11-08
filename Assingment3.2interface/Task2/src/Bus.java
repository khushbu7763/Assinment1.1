public class Bus extends AbstractVehicle {

    public Bus() {
        super("Bus", "Diesel", "White");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nCapacity: 40 passengers";
    }
}