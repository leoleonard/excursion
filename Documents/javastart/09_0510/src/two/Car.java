package two;

public class Car extends Vehicle {
    private int capacity;

    public Car(String name, int year, int capacity) {
        super(name, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
