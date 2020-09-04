import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String newString = "";
        char checkChar = str.charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (checkChar != str.charAt(i)) {
                newString = newString + checkChar + count;
                checkChar = str.charAt(i);
                count = 1;
            } else {
                count += 1;
            }
        }
        newString = newString + checkChar + count;
        System.out.println(newString);
    }
}
