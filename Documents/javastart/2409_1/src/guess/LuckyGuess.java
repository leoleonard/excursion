package guess;
import java.util.Scanner;

public class LuckyGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Podaj liczbę");

        do {

            number = scan.nextInt();

            if (number < 100 ){
                System.out.println("Podana liczba jest za mała");
                System.out.println("Podaj liczbę");
                continue;
            }

            if (number > 200 ){
                System.out.println("Podana liczba jest za duża");
                System.out.println("Podaj liczbę");
                continue;
            }

            if (number %3 != 0 ){
                System.out.println("Liczba nie jest podzielna przez 3");
                System.out.println("Podaj liczbę");
                continue;
            }

        } while (number < 100 || number > 200 || number % 3 != 0);

        System.out.println("Twoja liczba jest ok :-)");

    }
}
