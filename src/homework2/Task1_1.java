package homework2;
/**
 * В переменную записываем число. Надо вывести на экран сколько в этом
 * числе цифр и положительное оно или отрицательное. Например, "это
 * однозначное положительное число". Достаточно будет определить, является ли
 * число однозначным, "двухзначным или трехзначным и более.
 **/

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = scanner.nextInt();
        int tmp = i;
        int count = 0;
        while (tmp != 0) {
            tmp = tmp / 10;
            count = count + 1;
        }
        if (i < 0) {
            System.out.println("Отрицательное число. Количество цифр = " + count);
        } else if (i > 0) {
            System.out.println("Положительное число. Количество цифр = " + count);
        } else {
            System.out.println("Ноль. Количество цифр = 1");
        }
    }
}
