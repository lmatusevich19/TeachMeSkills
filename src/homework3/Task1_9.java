package homework3;

import java.util.Random;
import java.util.Scanner;

/**
 * Пользователь должен указать с клавиатуры положительное число, а
 * программа должна создать массив указанного размера из случайных целых
 * чисел из [0;15] и вывести его на экран в строку. После этого программа должна
 * определить и сообщить пользователю о том, сумма какой половины массива
 * больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
 * пользователь введёт неподходящее число, то выдать соответствующее
 * сообщение
 */
public class Task1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = 0;
        while (true) {
            System.out.print("Введите длину массива: ");
            size = scanner.nextInt();
            if (size > 0 && size % 2 == 0) {
                break;
            } else {
                System.out.println("Повторите ввод. Длина масива должна быть больше 0 и четная.");
            }
        }

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int left = 0;
        int right = 0;
        for (int i = 0; i < array.length / 2; i++) {
            left = left + array[i];
            right = right + array[array.length / 2 + i];
        }

        if (left < right) {
            System.out.println("Сумма левой половины - " + left + " меньше правой - " + right);
        } else if (left > right) {
            System.out.println("Сумма левой половины - " + left + " больше правой - " + right);
        } else {
            System.out.println("Сумма левой половины - " + left + " равна правой - " + right);
        }
    }
}
