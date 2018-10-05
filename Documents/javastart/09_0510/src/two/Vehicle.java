package two;

public abstract class Vehicle implements Moveable {
    private String name;
    private int year;
    private String direction;

    public Vehicle(String name, int year, String direction) {
        this.name = name;
        this.year = year;
        this.direction = direction;
    }

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
        setDirection("Left");
    }

    @Override
    public void goForward() {
        setDirection("Na przód");
    }

    @Override
    public void goBack() {
        setDirection("Do tyłu");
    }

    @Override
    public void turnRight() {
        setDirection("W prawo");
    }

    //musza byc zaimplementowane wszystkie metody aby klasy korzystajace z Vehicle nie byly abstrakcyjne
}
