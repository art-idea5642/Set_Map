import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 10, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7));

        NumbersPrinter numbersPrinter = new NumbersPrinter(nums);
        numbersPrinter.printOddNumbers();
        System.out.println();
        numbersPrinter.printEvenNumbers();

        List<String> words = new ArrayList<>(List.of(
                "apple", "banana", "apple", "orange", "banana",
                "car", "truck", "bus","computer", "keyboard", "mouse","apple", "robot","banana"));

        WordsPrinter uniqueWordsPrinter = new WordsPrinter(words);
        uniqueWordsPrinter.printUniqueWords();


        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        DuplicateCounter DuplicateCounter = new DuplicateCounter(strings);
        DuplicateCounter.countAndPrintDuplicates();
    }

}