import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsPrinter {
    private final List<String> words;

    // Конструктор для установки списка слов
    public WordsPrinter(List<String> words) {
        this.words = new ArrayList<>(words);
    }

    // Метод для печати уникальных слов
    public void printUniqueWords() {
        Set<String> uniqueWords = new HashSet<>(words);

            System.out.println(uniqueWords);
    }
}
