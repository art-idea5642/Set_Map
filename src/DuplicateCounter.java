import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCounter {
    private final List<String> words;


    public DuplicateCounter(List<String> words) {
        this.words = new ArrayList<>(words);
    }

    public void countAndPrintDuplicates() {

        Map<String, Integer> wordCountMap = new HashMap<>();


        for (String word : words) {
            Integer count = wordCountMap.getOrDefault(word, 0);
            wordCountMap.put(word, count + 1);
        }


        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
