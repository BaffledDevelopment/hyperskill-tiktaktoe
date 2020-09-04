import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n != 0) {
                sum = sum + n;
                
            } else {
                System.out.println(sum);
                break;
            }
        }

    }
}
