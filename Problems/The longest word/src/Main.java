import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String test = scanner.nextLine();

//        String[] myArray = test.split(" ");
//        String theLongestWord = myArray[0];

        int longWordPosition = 0;

        for (int i = 1; i < myArray.length; i++) {

            if (theLongestWord.length() >= myArray[i].length()) {
                continue;

            } else if (theLongestWord.length() < myArray[i].length()){
                theLongestWord = myArray[i];
            }
        }
        System.out.println(theLongestWord);



    }
}