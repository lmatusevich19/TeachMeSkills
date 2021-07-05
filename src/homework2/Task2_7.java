package homework2;

/**
 * Напишите программу, определяющую сумму всех нечетных чисел от 1
 * До 99
 */
public class Task2_7 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 99; i += 2) {
            result = result + i;
        }
        System.out.println(result);
    }
}
