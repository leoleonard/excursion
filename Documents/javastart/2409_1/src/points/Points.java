package points;

import java.util.Scanner;

public class Points {
    public static void main(String[] args) {
        double x;
        double y;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point X");
        x = scan.nextDouble();

        System.out.println("Enter point Y");
        y = scan.nextDouble();
        scan.nextLine();


        if (x>0 && y>0) {
            System.out.println("First quarter");
        }

        if (x>0 && y<0) {
            System.out.println("Second quarter");
        }

        if (x<0 && y<0) {
            System.out.println("Third quarter");
        }
        if (x<0 && y>0) {
            System.out.println("Fourth quarter");
        }
        if (x==0 && y==0) {
            System.out.println("Perfect, it's 0,0");
        } else if (x==0 || y==0){
            System.out.println("Perfect, it's 0,0");
        }

    }
}
