package BikeShop;

public interface RentableBike {
   boolean taken();
   void handOver();
   String rent(String firstName);

}
