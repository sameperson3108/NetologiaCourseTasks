package part1;

import java.util.Scanner;

public class TicTacToe {

    public static final int SIZE = 3;
    public static final char EMPTY = ' ';
    public static final char CROSS = 'X';
    public static final char ZERO = '0';

    static void main() {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean isCrossTurn = true;

        while (true) {
            System.out.println("Ходят " + (isCrossTurn ? "крестики" : "нолики") + "!");
            printField(field);
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;

            if (field[x][y] != EMPTY) { continue; }

            field[x][y] = isCrossTurn ? CROSS : ZERO;

            if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                System.out.println("Выиграли " + (isCrossTurn ? "крестики" : "нолики"));
                break;
            }
            else {
                if (isCrossTurn) isCrossTurn = false;
                else isCrossTurn = true;
            }
        }



    }

    public static boolean isWin(char[][] field, char player) {
        if (field[0][0] == player && field[0][1] == player && field[0][2] == player) return true;
        if (field[1][0] == player && field[1][1] == player && field[1][2] == player) return true;
        if (field[2][0] == player && field[2][1] == player && field[2][2] == player) return true;

        if (field[0][0] == player && field[1][0] == player && field[2][0] == player) return true;
        if (field[0][1] == player && field[1][1] == player && field[2][1] == player) return true;
        if (field[0][2] == player && field[1][2] == player && field[2][2] == player) return true;

        if (field[0][0] == player && field[1][1] == player && field[2][2] == player) return true;
        if (field[2][0] == player && field[1][1] == player && field[0][2] == player) return true;

        return false;

    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] == EMPTY) {
                    System.out.print("-");
                } else {
                    System.out.print(row[i]);
                }
                if (i < row.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
