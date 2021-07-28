package homework8.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("source.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

        String source = "";
        String line = bufferedReader.readLine();
        while (line != null) {
            source = source.concat(line);
            line = bufferedReader.readLine();
        }

        String[] countSentences = TextFormatter.countSentences(source);
        for (String tmpSentence : countSentences) {
            tmpSentence = tmpSentence.trim();
            int countWordInSentence = TextFormatter.countWordsInSentence(tmpSentence);
            if ((countWordInSentence > 2 && countWordInSentence < 6) ||
                    TextFormatter.includePalindrome(tmpSentence)) {
                bufferedWriter.write(tmpSentence + ".");
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
