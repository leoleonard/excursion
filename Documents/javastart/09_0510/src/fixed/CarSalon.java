package fixed;

public class CarSalon {
    public static void main(String[] args) {
        RentableCar[] cars = new RentableCar[2];
        cars[0] = new RentableCar("Volvo", 2012, 5);
        cars[1] = new RentableCar("VW", 2016, 4);

        cars[0].rent("Jan", "Kowalski", "1234");
        if (cars[0].isRent()) {
            System.out.println("Samochód wypożyczony dla " + cars[0].getPerson());
        } else {
            System.out.println("Samochód można wypożyczyć");
        }

        cars[0].handOver();
        //cars[0].rent("Ola", "Matoła", "123");
        if(cars[0].isRent()) {
            System.out.println("Samochód wypożyczony");
        } else {
            System.out.println("Samochód można wypożyczyć");
        }

    }
}
