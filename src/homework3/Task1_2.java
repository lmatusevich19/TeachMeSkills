package homework3;

/**
 * )Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
 * строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
 * порядке (99 97 95 93 … 7 5 3 1)
 */
public class Task1_2 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a = a + 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

