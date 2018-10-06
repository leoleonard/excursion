package two;

public abstract class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 2014, 5);
        Motorbike motorbike1 = new Motorbike("Honda", 2018,  220);

        car1.turnLeft();
        System.out.println(car1.getName() + " drives "  + car1.getDirection());
        car1.goForward();
        System.out.println(car1.getName() + " drives " + car1.getDirection());
        car1.goBack();
        System.out.println(car1.getDirection());
    }
}
