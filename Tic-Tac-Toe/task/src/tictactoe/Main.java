package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ttString = scanner.nextLine();
        TicTakEngine teehee = new TicTakEngine(ttString);
        teehee.printField();

        teehee.updateBoard();

        System.out.println(teehee.printWinner());

    }
}
