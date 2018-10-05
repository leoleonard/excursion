package three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Podaj wiek");
       int age = 0;
       int[] tab = {5, 10, 15};

        System.out.println("Podaj index");
        try {
            int index = scanner.nextInt();
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index poza zasięgiem");
        } catch (InputMismatchException e) {
            System.out.println("wprowadz liczbe");
        }

//        System.out.println("Podaj index");
//        try {
//            int index = scanner.nextInt();
//            System.out.println(tab[index]);
//        } catch (RuntimeException e) {
//            System.out.println("niepoprawny index");
//        }

        // metoda dziedziczenia

//        System.out.println("Podaj index");
//        try {
//            int index = scanner.nextInt();
//            System.out.println(tab[index]);
//        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
//            System.out.println("zły index");
//        }
        //w jednym wierszu, wada: niespecyficzna obsluga bledow


//        try {
//            age = scanner.nextInt();
//            System.out.println("Dzięki");
//        } catch (InputMismatchException e) {
//            System.out.println("podales nieprawidlowa wartosc, podaj liczbę.");
//        } finally {
//            System.out.println("to sie wykona zawsze");
//        }
        //try - jaki problemmozmey napotkac
        //w catch typ wyjatku ktory chcemy przechwycic, wykona sie po wystapieniu wymienionego wyjatku

//        scanner.nextLine(); // usuniecie entera
//
//        System.out.println("Podaj imie");
//        String name = scanner.nextLine();
//
//        System.out.println(name + " " + age);
    }
}
