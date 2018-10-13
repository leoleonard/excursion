package two;

import javax.print.attribute.standard.RequestingUserName;

public abstract class RentableCarTest {
    public static void main(String[] args) {
        RentableCar[] cars = new RentableCar[2];
        cars[0] = new RentableCar("BMW M5", 2017, 5);
        cars[1] = new RentableCar("Volvo", 2012, 6);
        cars[0].rent("Jan", "Kowalski", "123456");
        cars[1].rent("Ola", "Skalka", "1234");


        cars[1].handOver();
        if(cars[0].isRent()) {
            System.out.println("Samochód wypożyczony do " + cars[1].getPerson());
        } else {
            System.out.println("Samochód można wypożyczyć");
        }

        System.out.println(">>>>>>>>");
        cars[1].handOver();
        if(cars[1].isRent()) {
            System.out.println("Samochód wypożyczony");
        } else {
            System.out.println("Samochód można wypożyczyć");
        }







    }
}
