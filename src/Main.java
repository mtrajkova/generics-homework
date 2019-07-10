import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericPalindrome<String> strings = new GenericPalindrome<>(Arrays.asList("a", "b", "c"));
        System.out.println(strings.checkIfPalindrome());

        GenericPalindrome<Integer> integers = new GenericPalindrome<>(Arrays.asList(new Integer(1), new Integer(2)));
        System.out.println(integers.checkIfPalindrome());

        GenericPalindrome<Double> doubles = new GenericPalindrome<>(Arrays.asList(new Double(2.5), new Double(3.4), new Double(2.5)));
        System.out.println(doubles.checkIfPalindrome());
    }
}
