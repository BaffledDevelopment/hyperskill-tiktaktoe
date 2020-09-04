import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String newString = "";

        int n = str.length() % 2;
        System.out.println(n);

        if (str.length() == 2){
            System.out.println(newString);
        }else if (str.length() % 2 == 0){
            newString = str.substring(0, str.length() / 2 - 1) + str.substring(str.length() / 2 + 1);
        } else {
            newString = str.substring(0, str.length() / 2) + str.substring(str.length() / 2 + 1);
        }
        System.out.println(newString);
    }
}

