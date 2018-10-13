public class Product {
    String name;
    double cena;
    String dataWaznosci;
    boolean dataUzycia;

    Product(String name, double cena, boolean dU) {
        this.name = name;
        this.cena = cena;
        dataUzycia = dU;
    }
}
