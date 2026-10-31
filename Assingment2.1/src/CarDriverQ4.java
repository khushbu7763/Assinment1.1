public class CarDriverQ4 {

    public static void main(String[] args) {

        CarclassQ4 myCar = new CarclassQ4("Toyota Corolla", 60, 50);

        // set minimum and maximum speed
        myCar.setMinSpeed(30);
        myCar.setMaxSpeed(120);

        // set target speed
        myCar.setCruiseControlSpeed(80);

        System.out.println("Target speed: " +
                myCar.getCruiseControlSpeed());

        // turn cruise control on
        boolean success = myCar.turnCruiseControlOn();

        if (success) {
            System.out.println("Cruise control is on");
            System.out.println("Current speed: " + myCar.getSpeed());
        } else {
            System.out.println("Target speed cannot be reached");
        }

        // turn cruise control off
        myCar.turnCruiseControlOff();

        System.out.println("Cruise control is on: " +
                myCar.isCruiseControlOn());

        // test invalid target speed
        myCar.setCruiseControlSpeed(150);

        success = myCar.turnCruiseControlOn();

        if (!success) {
            System.out.println("Target speed cannot be reached");
            System.out.println("Cruise control is off");
        }
    }
}

/*
Why modify CarDriver first?

We modify the CarDriver class first because it shows
how the cruise control feature should be used.
it helps us identify which methods are needed in the Car class.
then we implement those methods in the Car class
and test that they work correctly.
******/