public class CarclassQ4 {

    private String typeName;
    private double tankCapacity;
    private double gasolineLevel;
    private double speed;

    private double cruiseControlSpeed;
    private double minSpeed;
    private double maxSpeed;
    private boolean cruiseControlOn;

    public CarclassQ4(String typeName, double tankCapacity, double speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        gasolineLevel = 0;

        minSpeed = 30;
        maxSpeed = 120;
        cruiseControlSpeed = 0;
        cruiseControlOn = false;
    }

    public void accelerate() {
        speed = speed + 10;
    }

    public void decelerate() {
        speed = speed - 10;

        if (speed < 0) {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    // set target speed
    public void setCruiseControlSpeed(double targetSpeed) {
        cruiseControlSpeed = targetSpeed;
    }

    // read target speed
    public double getCruiseControlSpeed() {
        return cruiseControlSpeed;
    }

    // set minimum speed
    public void setMinSpeed(double minSpeed) {
        this.minSpeed = minSpeed;
    }

    // set maximum speed
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // turn cruise control on
    public boolean turnCruiseControlOn() {

        if (minSpeed > maxSpeed ||
                cruiseControlSpeed < minSpeed ||
                cruiseControlSpeed > maxSpeed) {

            cruiseControlOn = false;
            return false;
        }

        while (speed < cruiseControlSpeed) {
            speed = Math.min(speed + 10, cruiseControlSpeed);
        }

        while (speed > cruiseControlSpeed) {
            speed = Math.max(speed - 10, cruiseControlSpeed);
        }

        cruiseControlOn = true;
        return true;
    }

    // turn cruise control off
    public void turnCruiseControlOff() {
        cruiseControlOn = false;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }
}