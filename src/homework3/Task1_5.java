package homework3;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
 * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
 * арифметическое элементов каждого массива и сообщите, для какого из
 * массивов это значение оказалось больше (либо сообщите, что их средние
 * арифметические равны).
 */
public class Task1_5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            array1[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));

        double middle1 = 0;
        double middle2 = 0;
        for (int i = 0; i < array.length; i++) {
            middle1 = middle1 + array[i];
            middle2 = middle2 + array1[i];
        }
        if (middle1 / array.length < middle2 / array1.length) {
            System.out.println("Среднее арифметическое первого массива = " + middle1 / array.length +
                    " меньше, чем среднее арифметическое второго массива = " + middle2 / array1.length);
        }
        else if (middle1 / array.length > middle2 / array1.length){
            System.out.println("Среднее арифметическое первого массива = " + middle1 / array.length +
                    " больше, чем среднее арифметическое второго массива = " + middle2 / array1.length);

        }
        else {
            System.out.println("Средние арифметические равны");
        }

    }
}
