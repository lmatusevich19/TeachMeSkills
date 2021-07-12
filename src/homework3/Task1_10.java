package homework3;

import java.util.Random;
import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
 * переменную n. Если пользователь ввёл не подходящее число, то программа
 * должна выдать соответствующее сообщение. Создать массив из n случайных
 * целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
 * только из чётных элементов первого массива, если они там есть, и вывести его
 * на экран.
 */
public class Task1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        while (true) {
            System.out.print("Введите число: ");
            n = scanner.nextInt();
            if (n > 3) {
                break;
            } else {
                System.out.println("Вы ввели некорректное число. Число должно быть больше 3.");
            }
        }

        int[] array = new int[n];
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n + 1);
            if (array[i] % 2 == 0 || array[i] == 0) {
                size++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = index; j < array.length; j++) {
                if (array[j] % 2 == 0) {
                    result[i] = array[j];
                    index = j + 1;
                    break;
                }
            }
            System.out.print(result[i] + " ");
        }
    }
}
