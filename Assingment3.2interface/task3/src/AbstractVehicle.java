public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    protected String vehicleType;

    public AbstractVehicle(String vehicleType) {
        this.vehicleType = vehicleType;
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
    public abstract String getInfo();
}