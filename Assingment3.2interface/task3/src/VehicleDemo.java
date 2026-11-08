public class VehicleDemo {

    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        // Car
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println(car.getInfo());

        // Test charging for normal car
        car.charge();

        System.out.println();

        // Motorcycle
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());

        // Test charging for normal motorcycle
        motorcycle.charge();

        System.out.println();

        // Bus
        Bus bus = new Bus();
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());

        // Test charging for bus
        bus.charge();

        System.out.println();

        // Electric Car
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.charge();
        electricCar.stop();
        System.out.println(electricCar.getInfo());

        System.out.println();

        // Electric Motorcycle
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();
        electricMotorcycle.start();
        electricMotorcycle.charge();
        electricMotorcycle.stop();
        System.out.println(electricMotorcycle.getInfo());

    }
}