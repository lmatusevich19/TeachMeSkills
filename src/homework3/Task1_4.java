package homework3;

import java.util.Random;

/**
 * Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
 * массив на экран в строку. Замените каждый элемент с нечётным индексом на
 * ноль. Снова выведете массив на экран на отдельной строке
 */
public class Task1_4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
