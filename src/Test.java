public class Test {
    public static void main(String[] args) {
        AppControl appControl = new AppControl();
        Computer computer = new Computer(new Processor("Core i9", "Intel", "123412", 3.60, 30, 50),
                new Ram("Fury Black", "HyperX", "412312", 8, 1600, 30, 50),
                new HardDrive("860 Evo", "Samsung", "1421331", 500));

        appControl.control(computer.getComponents());
    }
}


