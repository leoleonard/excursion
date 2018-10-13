public class LogicalOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        boolean czyRowne = a ==b;
        System.out.println(czyRowne);

        boolean czyRozne = a!=b;
        System.out.println(czyRozne);

        boolean czyAwiekszeOd10 = a > 10;

        System.out.println(czyRowne && czyAwiekszeOd10);
        System.out.println(czyRowne || czyAwiekszeOd10);

    }
}
