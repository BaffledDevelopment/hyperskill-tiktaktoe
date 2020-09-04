package tictactoe;
import java.util.Scanner;

public class TicTakEngine {

    boolean Xwins;
    boolean Owins;
    String inputData;
    char[][] tiktakArray;
    char symbol;
    int roundCount;

    public TicTakEngine(String inputData) {
        this.Xwins = false;
        this.Owins = false;
        this.inputData = inputData;
        this.tiktakArray = fillTheArray();
        this.symbol = 'X';
        this.roundCount = 0;

    }

    public char[][] fillTheArray(){

        char[][] tmp = new char[3][3];

        for (int i = 0; i < 9; i++) {
            tmp[i/3][i%3] = '_'; // shamelessly stolen from previous solutions
        }
        return tmp;
    }

    public void printField() {
        System.out.println("---------");
        for (int i = 0; i < 3; i += 1) {
            System.out.println("|" + " " + tiktakArray[i][0] + " " +
                    tiktakArray[i][1] + " " + tiktakArray[i][2] + " " + "|");
        }
        System.out.println("---------"); // prints the field
    }

    public void analyzeResults() {
        checkRows();
        checkColumns();
        checkDiagonals();
    }

    public void checkRows() {
        char winnerResult;

        for (int i = 0; i < 3; i += 1) {
            winnerResult = tiktakArray[i][0];
            if (winnerResult == tiktakArray[i][1] && winnerResult == tiktakArray[i][2]) {
                setWinner(winnerResult);
            }
        }
    }

    public void checkColumns() {
        char winnerResult;

        for (int i = 0; i < 3; i++) {
            winnerResult = tiktakArray[0][i];
            if (winnerResult == tiktakArray[1][i] && winnerResult == tiktakArray[2][i]) {
                setWinner(winnerResult);
            }
        }
    }

    public void checkDiagonals() {
        char topLeftCorner = tiktakArray[0][0];
        char topRightCorner = tiktakArray[0][2];

        if (topLeftCorner == '_' && topRightCorner == '_') {
            return;
        }
        if (topLeftCorner == tiktakArray[1][1] && topLeftCorner == tiktakArray[2][2]) {
            setWinner(topLeftCorner);
        }
        if (topRightCorner == tiktakArray[1][1] && topRightCorner == tiktakArray[2][0]) {
            setWinner(topRightCorner);
        }
    }

    public void setWinner(char winnerResult){
        if (winnerResult == 'X') {
            Xwins = true;
        } else if (winnerResult == 'O') {
            Owins = true;
        }
    }

    public String printWinner() {
        if (!Xwins && !Owins && inputData.chars().filter(e -> e == '_').count() == 0) {
            return "Draw"; // this must be the first check, otherwise it wont work
        }
        if (Xwins && Owins) {
            return "Impossible";
        }
        if (Xwins) {
            return "X wins";
        }
        if (Owins) {
            return "O wins";
        }
        return "Game not finished";
    }

    public void updateBoard() {

        Scanner scanner = new Scanner(System.in);

        int first;
        int second;

        while (true) {

            String userInputLine = scanner.nextLine();

            try {
                System.out.println("Enter the coordinates");

                String[] pieces = userInputLine.split(" ");
                first = Integer.parseInt(pieces[0]);
                second = Integer.parseInt(pieces[1]);

            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                continue;
            }

            if (first > 3 || second > 3 || first < 1 || second < 1) {
                System.out.println("Out of bounds!");
                continue;
            }

            if (tiktakArray[3 - second][first - 1] != '_') {
                System.out.println("This cell is occupied! Choose another one.");
                continue;
            }

            setThisIntoArray(symbol, first, second);
            analyzeResults();
            printField();

            roundCount += 1;

            if (!Xwins && !Owins && roundCount == 9) {
                break;
             } else if (Xwins || Owins) {
                break;
            }

            symbol = symbol == 'X' ? 'O' : 'X';


        }
        scanner.close();
    }

    public void setThisIntoArray(char symbol, int first, int second) {
            tiktakArray[3 - second][first - 1] = symbol;
    }
}

