package homework2;

/**
 * (Дополнительно) В переменную записываете количество программистов. В
 * зависимости от количества программистов необходимо вывести правильно
 * окончание. Например:
 * • 2 программиста
 * • 1 программиста
 * • 10 программистов
 * • и т.д.
 */
public class Task1_7 {
    public static void main(String[] args) {
        int d = 21;
        int i = d % 10;
        if (i > 4 || i == 0) {
            System.out.println(d + " программистов");
        } else {
            System.out.println(d + " программиста");
        }
    }
}
