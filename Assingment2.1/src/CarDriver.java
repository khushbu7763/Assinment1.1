
public class CarDriver {

    public static void main(String[] args) {

        Carclass myCar = new Carclass("Toyota Corolla", 60, 0);

        myCar.fillTank();
        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is "
                            + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is "
                            + myCar.getSpeed() + " km/h");
        }
    }
}
