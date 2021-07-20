package homework4;

import java.util.Random;
import java.util.Scanner;

/**
 * Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
 * случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
 * матрицы).
 */
public class Task4_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int length = scanner.nextInt();
        int[][] array = new int[length][length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //1)Почитать сумму четных элементов стоящих на главной диагонали.
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j && array[i][j] % 2 == 0) {
                    result = result + array[i][j];
                }
            }
        }
        System.out.print("Сумма четных элементов стоящих на главной диагонали = " + result);
        System.out.println();
        System.out.print("нечетные элементы находящиеся под главной диагональю включительно ");
        //Вывести нечетные элементы находящиеся под главной
        //диагональю(включительно)
        int result1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i >= j && array[i][j] % 2 == 1) {
                    System.out.print(array[i][j] + " ");
                }
            }

        }
        //Проверить произведение элементов какой диагонали больше
        int diag1 = 1;
        int diag2 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    diag1 = diag1 * array[i][j];
                }
                if (j - length + i + 1 == 0) {
                    diag2 = diag2 * array[i][j];
                }
            }
        }
        System.out.println();
        if (diag1 < diag2) {
            System.out.println("произведение элементов левой диагонали меньше, чем произведение элементов правой диагонали");
        } else if (diag1 > diag2) {
            System.out.println("произведение элементов левой диагонали больше, чем произведение элементов правой диагонали");
        } else {
            System.out.println("произведение элементов левой диагонали равно произведению элементов правой диагонали");
        }
        //Посчитать сумму четных элементов стоящих над побочной диагональю (не
        //включительно)
        int result2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j - length + i + 1 < 0 && array[i][j] % 2 == 0) {
                    result2 = result2 + array[i][j];
                }
            }
        }
        System.out.println("сумма четных элементов стоящих над побочной диагональю " + result2);

        //Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
        //строкой и т. д.)
        int[][] array1 = new int[length][length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = array[j][i];
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }


}