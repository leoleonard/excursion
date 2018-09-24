public class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.processor = "Intel";
        comp1.memory = 1224;

        Computer comp2 = new Computer();
        comp2.processor = "AMD";
        comp2.memory = 812;

        comp1.printInfo();
        comp2.printInfo();
    }
}
