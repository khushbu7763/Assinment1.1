public class VehicleDemo {

    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();
        Vehicle electricCar = new ElectricCar();
        Vehicle electricMotorcycle = new ElectricMotorcycle();

        demonstrateVehicle(car);
        demonstrateVehicle(motorcycle);
        demonstrateVehicle(bus);
        demonstrateVehicle(electricCar);
        demonstrateVehicle(electricMotorcycle);
    }

    public static void demonstrateVehicle(Vehicle vehicle) {

        vehicle.start();
        vehicle.stop();

        System.out.println(vehicle.getInfo());

        System.out.println("Fuel Efficiency: "
                + vehicle.calculateFuelEfficiency());

        if (vehicle instanceof ElectricVehicle) {
            ((ElectricVehicle) vehicle).charge();
        } else {
            ((ElectricVehicle) vehicle).charge();
        }

        System.out.println();
    }
}