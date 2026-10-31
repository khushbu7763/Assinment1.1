public class Carclass {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;

    public Carclass(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        tankCapacity = 100;
        this.typeName = typeName;
    }

    // task2: additional constructor
    public Carclass(String typeName, double tankCapacity, double speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        gasolineLevel = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
        } else {
            speed = 0;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0 && amount > 0) {
            speed = Math.max(0, speed - amount);
        } else if (gasolineLevel <= 0) {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = tankCapacity;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }
}

