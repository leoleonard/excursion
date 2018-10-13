package range;

public class Range {
    public static void main(String[] args) {
        int start = 0;
        int stop = 30;

        int i = 0;
        while (start + i <= stop) {
            if ((start + i) < stop) {
                System.out.printf("%.1f, ", (double) (start + i) / 10);
                i = i + 1;
            } else {
                System.out.printf("%.1f", (double) (start + i) / 10);
                i = i + 1;
            }
        }
    }
}
