import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        String cous = scanner.nextLine();

        System.out.println("The form for " + name + " is completed. " +
                "We will contact you if we need a chef that cooks " + cous + " dishes.");

    }
}