public class Car extends AbstractVehicle {

    public Car() {
        super("Car");
    }

    @Override
    public String getInfo() {
        return "Car Information:\n" +
                "Type: Car\n" +
                "Fuel: Petrol\n" +
                "Color: Red";
    }
}