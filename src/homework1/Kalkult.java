package homework1;

import java.util.Scanner;

public class Kalkult {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        double numb1;
        double numb2;
        double answer;
        System.out.println("введите число 1");
        numb1 = Scan.nextDouble();
        System.out.println("введите число 2");
        numb2 = Scan.nextDouble();
        char operator;
        while (true) {
            System.out.println("введите оператор +, -, *, /");
            operator = Scan.next().charAt(0);
            if (operator == '+') {
                answer = numb1 + numb2;
                System.out.println("ответ = " + answer);

            } else if (operator == '-') {
                answer = numb1 - numb2;
                System.out.println("ответ = " + answer);
            } else if (operator == '*') {
                answer = numb1 * numb2;
                System.out.println("ответ = " + answer);
            } else if (operator == '/') {
                if (numb2 == 0){
                    System.out.println("на 0 делить нельзя");
                    return;
                } else {
                    answer = numb1 / numb2;
                    System.out.println("ответ = " + answer);
                }
            } else {
                System.out.println("вы ввели неправильную операцию");
                break;
            }

        }
    }
}
