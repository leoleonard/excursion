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

        System.out.printf("Jestem %s, mam %d", name, age);
    }

}
