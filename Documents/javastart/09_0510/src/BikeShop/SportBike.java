package BikeShop;

public class SportBike extends Bike {
    private boolean speedLimit;

    public SportBike(String name, String size, String color, boolean speedLimit) {
        super(name, size, color);
        this.speedLimit = speedLimit;
    }

    public boolean isSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(boolean speedLimit) {
        this.speedLimit = speedLimit;
    }


}
