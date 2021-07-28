package homework5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer("Intel Core i3", "16GB", "1000GB", 10);
        int resource = computer.getResource();
        while (resource != 0) {
            int inputRandom = random.nextInt(2);
            System.out.print("Введите 0 или 1 - ");
            int inputUser = scanner.nextInt();
            boolean on = computer.onComputer(inputRandom, inputUser);
            boolean off = computer.offComputer(inputRandom, inputUser);
            if (on && off) {
                resource--;
                computer.setResource(resource);
                System.out.println(computer);
            } else {
                break;
            }
        }
        scanner.close();
    }
}
