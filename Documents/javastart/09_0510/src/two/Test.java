package two;

public abstract class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 2014, "Right", 5);
        Motorbike motorbike1 = new Motorbike("Honda", 2018, "Prawo", 220);

        car1.turnLeft();
        System.out.println(car1.getDirection());
    }
}
