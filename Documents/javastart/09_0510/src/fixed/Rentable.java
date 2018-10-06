package fixed;

public interface Rentable {
    boolean isRent();
    void handOver();
    void rent(String firstName, String lastname, String id);
}
