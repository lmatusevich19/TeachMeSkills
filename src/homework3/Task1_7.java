package homework3;

import java.util.Random;

/**
 * Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
 * какой элемент является в этом массиве максимальным и сообщите индекс его
 * последнего вхождения в массив.
 */
public class Task1_7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        int maxElement = array[0];
        int indexMaxElement = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (maxElement <= array[i]) {
                maxElement = array[i];
                indexMaxElement = i;
            }
        }
        System.out.println("Максимальный элемент: " + maxElement + " по индексу: " + indexMaxElement);
    }
}
