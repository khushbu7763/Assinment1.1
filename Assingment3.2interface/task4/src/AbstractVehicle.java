public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    protected String vehicleType;
    protected double fuelEfficiency;

    public AbstractVehicle(String vehicleType, double fuelEfficiency) {
        this.vehicleType = vehicleType;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(vehicleType + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(vehicleType + " is stopping...");
    }

    @Override
    public void charge() {
        System.out.println("Not possible to charge.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public abstract String getInfo();
}