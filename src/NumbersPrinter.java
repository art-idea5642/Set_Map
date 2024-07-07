import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NumbersPrinter {
    private final List<Integer> numbers;

    public NumbersPrinter(List<Integer> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    public void printOddNumbers() {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public void printEvenNumbers() {
        Set<Integer> evenNumbers = new TreeSet<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }
}
