package homework3;
/**
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементымассива на
 * экран сначала в строку, отделяя один элемент от другого пробелом, а
 * затем в столбик (отделяя один элемент от другого началом новой строки). Перед
 * созданием массива подумайте, какого он будет размера.
 */
public class Task1_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a = a + 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
