package fixed;

public class Vehicle implements Moveable {
    private String name;
    private int year;
    private String direction;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    //okreslenie domyslnego konstruktora, wylaczenie pola 'direction'

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        this.direction = "Left";
    }

    @Override
    public void turnRight() {
        this.direction = "Right";
    }

    @Override
    public void goFordward() {
        this.direction = "Forward";
    }

    @Override
    public void goBack() {
        this.direction = "Back";
    }
}
