package homework2;

/**
 * Даны 3 целых числа. Найти количество положительных и отрицательных
 * чисел в исходном наборе.
 */
public class Task1_5 {
    public static void main(String[] args) {
        int a = 9;
        int s = -11;
        int d = 13;
        int countN = 0;
        int countP = 0;
        if (a > 0) {
            countP = countP + 1;
        } else {
            countN = countN + 1;
        }
        if (s > 0) {
            countP = countP + 1;
        } else {
            countN = countN + 1;
        }
        if (d > 0) {
            countP = countP + 1;
        } else {
            countN = countN + 1;
        }
        System.out.println("Количество положительных чисел - " + countP);
        System.out.println("Количество отрицательных чисел - " + countN);
    }

}
