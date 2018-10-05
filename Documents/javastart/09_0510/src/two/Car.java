package two;

public class Car extends Vehicle {
    private int capacity;

    public Car(String name, int year, String direction, int capacity) {
        super(name, year, direction);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
