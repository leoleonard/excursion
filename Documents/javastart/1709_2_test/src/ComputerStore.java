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

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1, 100);

        ComputerUpgrade upgrade2 = new ComputerUpgrade();
        upgrade.addMemory(comp2, 200);

        comp1.printInfo();
        comp2.printInfo();

        ComputerFactory factory = new ComputerFactory();
        Computer comp3 = factory.create("Intel2", 827);
        Computer comp4 = factory.create("AMD2", 112);

        comp3.printInfo();
        comp4.printInfo();

        ComputerUpgrade upgrade3 = new ComputerUpgrade();
        upgrade3.addMemory(comp3, 100);
        upgrade3.addMemory(comp4, 30);

        comp3.printInfo();
        comp4.printInfo();

//        Computer comp5 = new Computer("New Intel", 512);
//
//        ComputerUpgrade upgrade4 = new ComputerUpgrade();
//        upgrade4.addMemory(comp5, 512);
//
//        comp5.printInfo();

    }
}
