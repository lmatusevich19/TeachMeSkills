package homework2;

/**
 * Вычислить: 1+2+4+8+...+256
 */
public class Task2_3 {
    public static void main(String[] args) {
        int count = 1;
        int result = 0;
        while (count <= 256) {
            result += count;
            count *= 2;
        }
        System.out.println("Result: " + result);
    }
}
