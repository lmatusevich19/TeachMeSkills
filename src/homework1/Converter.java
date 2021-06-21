package homework1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        double usd;
        double euro;
        double byn;

        System.out.println("Currency Converter");
        System.out.println("How many BYN rubles do you want to convert?");
        Scanner scanner = new Scanner(System.in);
        byn = scanner.nextFloat();
        usd = byn / 2.51;
        euro = byn / 3.02;
        System.out.println(byn + " BYN = " + usd + " USD ");
        System.out.println(byn + " BYN = " + euro + " EURO ");
    }
}
