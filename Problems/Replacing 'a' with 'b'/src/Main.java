import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String test = scanner.nextLine();

        char[] inputString = test.toCharArray();

        for (int i = 0; i < inputString.length; i++) {
            if (inputString[i] == 'a') {
                inputString[i] = 'b';
                System.out.print(inputString[i]);
            } else {
                System.out.print(inputString[i]);
            }

        }




    }
}