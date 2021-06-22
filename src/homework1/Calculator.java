package homework1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double answer;
        System.out.println("Enter number one: ");
        double numb1 = scan.nextDouble();
        System.out.print("Enter number two: ");
        double numb2 = scan.nextDouble();
        while (true) {
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scan.next().charAt(0);
            if (operator == '+') {
                answer = numb1 + numb2;
                System.out.println("Answer = " + answer);

            } else if (operator == '-') {
                answer = numb1 - numb2;
                System.out.println("Answer = " + answer);
            } else if (operator == '*') {
                answer = numb1 * numb2;
                System.out.println("Answer = " + answer);
            } else if (operator == '/') {
                if (numb2 == 0) {
                    System.out.println("ERROR: Division by zero!!!");
                    return;
                } else {
                    answer = numb1 / numb2;
                    System.out.println("Answer = " + answer);
                }
            } else {
                System.out.println("You enter incorrectly operator.");
                break;
            }
        }
    }
}
