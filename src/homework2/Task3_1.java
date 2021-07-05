package homework2;

import java.util.Scanner;

/**
 * Передать на вход программы число От 1 до 7 в качестве аргумента. Если число равно 1, выводим на консоль
 * “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if. Смотрите
 * решение задачи в видео.
 * Переписать задание 3 используя switch.
 */
public class Task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int i = scanner.nextInt();
        if (i == 1) {
            System.out.println("Понедельник");
        } else if (i == 2) {
            System.out.println("Вторник");
        } else if (i == 3) {
            System.out.println("Среда");
        } else if (i == 4) {
            System.out.println("Четверг");
        } else if (i == 5) {
            System.out.println("Пятница");
        } else if (i == 6 || i == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Такого дня недели не существует");
        }
    }
}
