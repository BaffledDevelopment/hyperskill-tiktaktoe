import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String test = scanner.next();

        int offset = scanner.nextInt();

        if (offset > test.length()) {
            System.out.println(test);
        } else {

            String newString = test.substring(0, offset);
//                test.substring(offset - 1, test.length());
            newString = test.substring(offset, test.length()) + newString;

            System.out.println(newString);
        }




    }
}