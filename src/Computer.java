import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Component[] components = new Component[3];

        components[0] = new Processor("Core i9", "Intel", "123412", 3.60, 30, 50);
        components[1] = new Ram("Fury Black", "HyperX", "412312", 8, 1600, 30, 50);
        components[2] = new HardDrive("860 Evo", "Samsung", "1421331", 500);

        //maksymalne temperatury ustawione tak, żeby nie trzeba było za dużo podkręcać

        int choice = 0;
        do {
            System.out.println(components[0].toString());
            System.out.println(components[1].toString());
            System.out.println("1 - podkręć parametry");
            System.out.println("0 - wyjdź");
            System.out.println("Wybierz co chcesz zrobic: ");
            choice = sc.nextInt();

            if (choice == 1)
                overclock(components);

        } while (choice != 0);


    }
    private static void overclock(Component[] components) {
        try {
            ((Processor)components[0]).overclock();
            ((Ram)components[1]).overclock();
        } catch (OverclockErrorException e) {
            System.err.println(e.getMessage());
        }
    }
}
