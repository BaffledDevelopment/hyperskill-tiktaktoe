import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int value = 0;
        int maxNum = 0;

        while ((value = readIn.nextInt()) != 0) {
            if (value > maxNum) {
                maxNum = value;
            }
        }

        System.out.println(maxNum);
    }
}
