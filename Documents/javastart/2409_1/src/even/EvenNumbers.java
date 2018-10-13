package even;

public class EvenNumbers {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ", ");
                total = total + i;
            }
        }

        System.out.println("Total of even numbers written above: " + total);
    }
}
