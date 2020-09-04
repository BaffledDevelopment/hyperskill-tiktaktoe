import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
           if (scanner.nextInt() == 0) {
               System.out.println(sum);
               break;
           } else {
               sum = sum + scanner.nextInt();
           }
       }

    }
}
