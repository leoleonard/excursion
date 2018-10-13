public class Calculations {
    public static void main(String[] args) {
        double liczbaJeden  =  12;
        double liczbaDwa = 5.5;

        double a = 12;
        double b = 5.5;

        double sum = a + b;
        double minus = a - b;
        double multiple = a * b;
        double modulo = a / b;

        System.out.print(sum);

        String name = "Jan";
        int age = 15;


        System.out.println('\u2602');

        System.out.println(liczbaJeden + " + " + liczbaDwa + " = " + (liczbaJeden + liczbaDwa));
        System.out.println(liczbaJeden + " - " + liczbaDwa + " = " + (liczbaJeden - liczbaDwa));
        System.out.println(liczbaJeden + " * " + liczbaDwa + " = " + (liczbaJeden * liczbaDwa));
        System.out.println(liczbaJeden + " / " + liczbaDwa + " = " + (liczbaJeden/liczbaDwa));;
        // a + b = c
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, sum);

        System.out.printf("Jestem %s, mam %d\n", name, age);

        boolean aWiekszeOd0 = a> 0;
        System.out.println("Czy a jest większe od 0?" + aWiekszeOd0);

        boolean aJestParzyste = a%2 == 0;
        System.out.println("Czy a jest parzyste?" + aJestParzyste);

        boolean ABwiekszeOd100 = a > 100 && b < 100;
        System.out.println("Czy A i B są większe od 100?" + ABwiekszeOd100);

        boolean AlubBWiekszeOd100 = a > 100 || b > 100;
        System.out.println("Czy A lub B są większe od 100?" + AlubBWiekszeOd100);
    }

}
