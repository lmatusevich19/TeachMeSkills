package homework2;

/**
 * Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
 * 10. Вывести полученное число.
 */
public class Task1_3 {
    public static void main(String[] args) {
        int j = 0;
        if (j > 0) {
            System.out.println(j + 1);
        } else if (j < 0) {
            System.out.println(j - 2);
        } else {
            System.out.println(j = 10);
        }
    }
}
