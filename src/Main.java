import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericPalindrome<String> strings = new GenericPalindrome<>(Arrays.asList("a", "b", "c"));
        System.out.println(strings.isPalindrome());

        GenericPalindrome<Integer> integers = new GenericPalindrome<>(Arrays.asList(new Integer(1), new Integer(2)));
        System.out.println(integers.isPalindrome());

        GenericPalindrome<Double> doubles = new GenericPalindrome<>(Arrays.asList(new Double(2.5), new Double(3.4), new Double(2.5)));
        System.out.println(doubles.isPalindrome());

        GenericPalindrome<Float> floats = new GenericPalindrome<>(Arrays.asList(new Float(2.5), new Float(3.4), new Float(3.4), new Float(2.5)));
        System.out.println(floats.isPalindrome());
    }
}
