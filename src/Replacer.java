import java.util.List;
import java.util.stream.IntStream;

public class Replacer {
    public static String createNewSentence(String sentence, char oldValue, char newValue, int recurrence) {
        char[] sentenceChars = sentence.toCharArray();

        List<Integer> indexesThatHaveValueToBeReplaced = IntStream.range(0, sentence.length())
                .filter(i -> sentence.charAt(i) == oldValue)
                .boxed()
                .toList();

        int counter = 1;

        for (Integer index : indexesThatHaveValueToBeReplaced) {

            if (recurrence == counter) {
                sentenceChars[index] = newValue;
                counter = 1;

                continue;
            }
            counter++;
        }

        return new String(sentenceChars);
    }
}
