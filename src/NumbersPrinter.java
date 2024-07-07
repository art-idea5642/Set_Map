import java.util.*;

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
        Collections.sort(numbers);
        int prevNum = Integer.MIN_VALUE;


        for (int number : numbers) {
            if (number % 2 == 0 && number != prevNum) {
                System.out.println(number);
                prevNum = number;
            }
        }
    }
}
