import java.sql.SQLOutput;

public class Shop {
    public static void main(String[] args) {
        Product product = new Product("Proszek", 19.99, true);
//        product.cena = 22.15;
//        product.name = "Proszek";
//        product.dataUzycia = true;

        Product productTwo = new Product("Vanish", 15.99, false );
//        productTwo.name = "Vanish";
//        productTwo.cena = 16.99;
//        productTwo.dataUzycia = false;

        System.out.println("Produkt " + product.name);
        System.out.println("Cena " + product.cena + "zł");
        System.out.println("Zdatny do użycia? " + product.dataUzycia);

        System.out.println("Produkt " + productTwo.name);
        System.out.println("Cena " + productTwo.cena + "zł");
        System.out.println("Zdatny do użycia? " + productTwo.dataUzycia);

//        Product productThree = new Product();
//        productThree.name = "Dosia";
//        productThree.cena = 15.99;
//
//        Product productFour = productThree; // obiekt 4 zostaje nadpisany, nie mozna sie juz do niego odniesc
//        productFour.name = "Colgate";
//        productFour.cena = 9.99;
//
//        System.out.println("Produkt " + productThree.name);
//        System.out.println("Cena " + productThree.cena);
//
//        System.out.println("Produkt " + productFour.name);
//        System.out.println("Cena " + productFour.cena);

        Product product3 = new Product("Zmywacz do paznokci", 12.99, true);
        System.out.println(product3.name + " " + product3.cena + " " +  product3.dataWaznosci);


    }

}
