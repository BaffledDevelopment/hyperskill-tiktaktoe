import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String newString = "";

        for (int i = 0; i < str.length(); ++i) {
            newString = newString + str.charAt(i) + str.charAt(i);
        }
        System.out.println(newString);
    }
}

