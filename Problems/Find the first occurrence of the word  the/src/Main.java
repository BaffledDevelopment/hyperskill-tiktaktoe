import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toLowerCase();

        char[] charsFromString = str.toCharArray();

        if (str.contains("the")) {
            for (int i = 0; i < charsFromString.length - 2; i++) {
                if (charsFromString[i] == 't'
                        && charsFromString[i + 1] == 'h' && charsFromString[i + 2] == 'e') {
                    System.out.println(i);
                    break;
                }
            }

        } else {
            System.out.println(-1);
        }

    }
}