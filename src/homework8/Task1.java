package homework8;

/**
 * Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
 * последнего вхождения сивола(B).
 */
public class Task1 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
                "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";

        char firstSymbol = 'a';
        char lastSymbol = 'p';
        int startIndex = str.indexOf(firstSymbol);
        int lastIndex = str.lastIndexOf(lastSymbol);
        if (startIndex >= 0 && lastIndex >= 0) {
            System.out.println(str.substring(startIndex, lastIndex));
        }
    }
}
