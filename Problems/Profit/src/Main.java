import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double currentSum = scanner.nextInt();
        int percentage = scanner.nextInt();
        double doWant = scanner.nextInt();

        int years = 0;

        while (currentSum < doWant) {
            currentSum = currentSum + (currentSum * percentage) / 100;
            years++;
        }
        System.out.println(years);
    }
}
