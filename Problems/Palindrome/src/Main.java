import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toLowerCase();
        boolean checker = false;

        int i = 0, j = str.length() - 1;

        // While there are characters toc compare

        while (i < j) {

            if (str.length() - 1 == 0) {
                System.out.println("no");
                break;
            }

            if (str.charAt(i) != str.charAt(j)) {
                checker = false;
                System.out.println("no");
                break;
            }
            checker = true;
            i++;
            j--;
        }
            System.out.println("yes");
    }
}