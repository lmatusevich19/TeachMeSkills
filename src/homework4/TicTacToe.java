package homework4;

import java.util.Scanner;

/**
 *
 */

public class TicTacToe {
    public static final int DESK_SIZE = 3;

    public static void main(String[] args) {
        char[][] ticTacToe = initDesk();
        char moveOnePlayer = 'X';
        char moveTwoPlayer = '0';
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printDesk(ticTacToe);
            enterMove(ticTacToe, moveOnePlayer, scanner, "Координата Х, Y первого игрока (1 <= X & Y <= 3 ): ");
            if (checkWin(moveOnePlayer, ticTacToe)) {
                System.out.println("Победил первый игрок!");
                break;
            }
            if (isTableFull(ticTacToe)) {
                System.out.println("Поле заполнено!");
                break;
            }
            printDesk(ticTacToe);
            enterMove(ticTacToe, moveTwoPlayer, scanner, "Координата Х, Y второго игрока (1 <= X & Y <= 3 ): ");
            if (checkWin(moveTwoPlayer, ticTacToe)) {
                System.out.println("Победил второй игрок!");
                break;
            }
            if (isTableFull(ticTacToe)) {
                System.out.println("Поле заполнено!");
                break;
            }
            System.out.println("Игра закончена!");
            printDesk(ticTacToe);
        }

    }

    private static boolean isTableFull(char[][] array) {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (array[row][col] == '.')
                    return false;
        return true;
    }

    private static void enterMove(char[][] ticTacToe, char moveTwoPlayer, Scanner scanner, String s) {
        while (true) {
            System.out.println(s);
            int moveTwoX = scanner.nextInt() - 1;
            int moveTwoY = scanner.nextInt() - 1;
            if (isCellValid(moveTwoX, moveTwoY) && isEmpty(ticTacToe, moveTwoPlayer, moveTwoX, moveTwoY)) {
                break;
            } else {
                System.out.println("ERROR: Вы ввели некорректные координаты.");
            }
        }
    }

    private static boolean isEmpty(char[][] ticTacToe, char movePlayer, int moveOneX, int moveOneY) {
        if (ticTacToe[moveOneX][moveOneY] == '.') {
            ticTacToe[moveOneX][moveOneY] = movePlayer;
            return true;
        }
        return false;
    }

    private static boolean isCellValid(int moveOneX, int moveOneY) {
        return moveOneX >= 0 && moveOneY >= 0 && moveOneX <= 2 && moveOneY <= 2;
    }

    public static char[][] initDesk() {
        char[][] initArr = new char[DESK_SIZE][DESK_SIZE];
        for (int i = 0; i < DESK_SIZE; i++) {
            for (int j = 0; j < DESK_SIZE; j++) {
                initArr[i][j] = '.';
            }
        }
        return initArr;
    }

    public static void printDesk(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWin(char dot, char[][] array) {
        for (int i = 0; i < 3; i++)
            if ((array[i][0] == dot && array[i][1] == dot &&
                    array[i][2] == dot) ||
                    (array[0][i] == dot && array[1][i] == dot &&
                            array[2][i] == dot))
                return true;
        if ((array[0][0] == dot && array[1][1] == dot &&
                array[2][2] == dot) ||
                (array[2][0] == dot && array[1][1] == dot &&
                        array[0][2] == dot))
            return true;
        return false;
    }
}
