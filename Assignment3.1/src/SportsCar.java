
public class SportsCar extends Carclass {

    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            super.accelerate();
            if (getGasolineLevel() > 0) {
            super.accelerate();
        }
        }

    }

    @Override
    public void decelerate(int amount) {
        super.decelerate(amount * 2);
    }
}
