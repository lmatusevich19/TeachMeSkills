package homework3;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
 * массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
 * массива должен равняться отношению элемента из первого массива с i-ым
 * индексом к элементу из второго массива с i-ым индексом. Вывести все три
 * массива на экран (каждый на отдельной строке), затем вывести количество
 * целых элементов в третьем массиве.
 */
public class Task1_8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array1 = new int[10];
        double[] array2 = new double[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            array1[i] = random.nextInt(10);
        }
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] != 0) {
                array2[i] = (double) array[i] / (double) array1[i];
            } else {
                array2[i] = array[i];
            }
            if (array2[i] % 1 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(count);
    }
}
