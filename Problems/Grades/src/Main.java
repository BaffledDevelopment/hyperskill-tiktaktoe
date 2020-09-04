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
            discardThisNumber = scanner.nextInt();
            if (discardThisNumber == 5) {
                Acounter++;
            } else if (discardThisNumber == 4) {
                Bcounter++;
            } else  {
                Ccounter++;

            }

        }
        System.out.println(Dcounter + " " + Ccounter + " " + Bcounter + " " + Acounter);
    }
}
вц