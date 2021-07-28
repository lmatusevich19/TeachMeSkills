package homework8.Task4;

import homework8.Task3;

public class TextFormatter {
    public static int countWordsInSentence(String str) {
        return str.split(" ").length;
    }

    public static String[] countSentences(String str) {
        return str.split("[\\.\\!\\?]");
    }

    public static boolean includePalindrome(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String tmp = words[i];
            tmp.replaceAll("[\\.\\,\\!\\?]", "");
            if (Task3.isPalindrome(tmp)) {
                return true;
            }
        }
        return false;
    }
}
