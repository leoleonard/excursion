package reverse;
import java.util.Scanner;

public class ReverseNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five names, please");
        String[] names = new String[5];

        for (int i = 0; i <= 4; i++) {
            names[i] = scan.next();
        }

        for (int k = 4; k >= 0; k--) {
            System.out.println("Hey " + names[k]);
        }

    }
}
