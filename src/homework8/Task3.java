package homework8;

import java.io.*;

/**
 * В исходном файле находятся слова, каждое слово на новой стороке. После
 * запуска программы должен создать файл, который будет содержать в себе
 * только полиндромы
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("source.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        String line = bufferedReader.readLine();
        while (line != null) {
            if (isPalindrome(line)) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                System.out.println(line);
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
