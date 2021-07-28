package homework8;

/**
 * Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
 * позиции 0
 */
public class Task2 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
                "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";

        char replaceSymbol = str.charAt(0);
        char replacementSymbol = str.charAt(3);

        System.out.println(str.replaceAll(String.valueOf(replacementSymbol), String.valueOf(replaceSymbol)));
    }
}
