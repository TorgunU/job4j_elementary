package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] boad, int row) {
        boolean result = true;
        for (int i = 0; i < boad[row].length; i++) {
            if (boad[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[i][row] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }
}
