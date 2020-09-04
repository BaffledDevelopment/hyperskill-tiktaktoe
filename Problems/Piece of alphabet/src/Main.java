import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toLowerCase();

        String alphabet = "abcdefghijklmopqrstuvwxyz";

        if (alphabet.contains(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}