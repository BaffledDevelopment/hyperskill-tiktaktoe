import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int discardThisNumber = scanner.nextInt();
        int Acounter = 0;
        int Bcounter = 0;
        int Ccounter = 0;

        while (scanner.hasNext()) {
            discardThisNumber = scanner.nextInt(); // reusing the code from a previous Grades task
            if (discardThisNumber == -1) {
                Acounter++;
            } else if (discardThisNumber == 0) {
                Bcounter++;
            } else  {
                Ccounter++;

            }

        }
        System.out.println(Bcounter + " " + Ccounter + " " + Acounter);
    }
}
