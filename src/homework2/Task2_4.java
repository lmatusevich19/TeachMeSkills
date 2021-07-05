package homework2;

/**
 * Составьте программу, вычисляющую A*B, не пользуясь операцией
 * Умножения.
 */
public class Task2_4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int result = 0;
        for (int i = 1; i <= b; i++) {
            result = result + a;
        }
        System.out.println(result);
    }
}
