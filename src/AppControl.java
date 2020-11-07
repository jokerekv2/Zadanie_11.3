import java.util.Scanner;

public class AppControl {
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("Z poniższych opcji wybierz jedną: ");
        System.out.println("1 - pokaż podzespoły i ich parametry");
        System.out.println("2 - podkręć ram");
        System.out.println("3 - podkręć procesor");
        System.out.println("0 - wyjdź");
    }

    public void control(Component[] components) {
        int choice;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    printComponentsInfo(components);
                    break;
                case 2:
                    searchForRam(components);
                    break;
                case 3:
                    searchForProcessor(components);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Błędny wybor!");
                    break;
            }
        } while (choice != 0);
    }

    public void printComponentsInfo(Component[] components) {
        for (Component component : components) {
            System.out.println(component.toString());
        }
    }

    public void searchForProcessor(Component[] component) {
        for (int i = 0; i < component.length; i++) {
            if (component[i] instanceof Processor) {
                try {
                    ((Processor) component[i]).overclock();
                } catch (OverclockErrorException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void searchForRam(Component[] component) {
        for (int i = 0; i < component.length; i++) {
            if (component[i] instanceof Ram) {
                try {
                    ((Ram) component[i]).overclock();
                } catch (OverclockErrorException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }
}
