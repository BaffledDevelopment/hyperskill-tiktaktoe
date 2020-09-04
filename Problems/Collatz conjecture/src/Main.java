import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int value = readIn.nextInt();

        while (value != 1) {
            System.out.print(value + " ");
            if (value % 2 != 0) {
                value = value * 3 + 1;
            } else {
                value = value / 2;
            }
        }
        System.out.print(value + " ");
    }
}
