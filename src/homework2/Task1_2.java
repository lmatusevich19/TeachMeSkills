package homework2;

/**
 * Треугольник существует только тогда, когда сумма любых двух его сторон
 * больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
 * стороны предполагаемого треугольника. Требуется сравнить длину каждого
 * отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
 * окажется больше суммы двух других, то треугольника с такими сторонами не
 * Существует
 **/
public class Task1_2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        int c = 15;
        if (a > b + c) {
            System.out.println("Такого треугольника не существует");
        } else if (b > a + c) {
            System.out.println("Такого треугольника не существует");
        } else if (c > a + b) {
            System.out.println("Такого треугольника не существует");
        } else {
            System.out.println("Такой треугольник существует");
        }
    }
}