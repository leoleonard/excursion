package fixed;

public class RentableCar extends Car implements Rentable {
   private Person person;

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
    }

    // brak Person person w konstruktorze

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public void rent(String firstName, String lastname, String id) {
        person = new Person(firstName, lastname, id);
    }

    @Override
    public String toString() {
        return "RentableCar{" +
                "person=" + person +
                '}';
    }
}
