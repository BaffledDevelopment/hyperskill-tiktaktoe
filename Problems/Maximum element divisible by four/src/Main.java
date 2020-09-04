import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 1000; i++)
            if (scanner.nextInt() * Math.pow(i, 3) + scanner.nextInt() * Math.pow(i, 2)
                    + scanner.nextInt() * i + scanner.nextInt() == 0) {
                System.out.println(i);
            }
    }
}
