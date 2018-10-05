package two;

public class RentableCar extends Car implements Rentable {
    private Person person;

    public RentableCar(String name, int year, String direction, int capacity) {
        super(name, year, direction, capacity);
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void rent(String fristName, String lastName, String id) {
        person = new Person("jan", "Kowalski", "12345");
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        return false;
    }
}
