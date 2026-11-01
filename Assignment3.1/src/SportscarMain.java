public class SportscarMain {
    public static void main(String[] args) {

        SportsCar sportsCar = new SportsCar("Ferrari");

        sportsCar.fillTank();

        sportsCar.accelerate();
        System.out.println("Sports car speed: " + sportsCar.getSpeed());

        sportsCar.decelerate(5);
        System.out.println("After deceleration: " + sportsCar.getSpeed());
    }
}
