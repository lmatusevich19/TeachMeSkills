package homework2;

import java.util.Scanner;

public class Task3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int i = scanner.nextInt();
        switch (i) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;
            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6:
            case 7: {
                System.out.println("Выходной");
                break;
            }
            default: {
                System.out.println("Такого дня недели не существует");
            }
        }

    }
}
