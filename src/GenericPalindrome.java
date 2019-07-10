import java.util.List;

public class GenericPalindrome<E> {
    List<E> list;

    public GenericPalindrome(List<E> list) {
        this.list = list;
    }

    public boolean checkIfPalindrome() {
        for (int i = 0; i <= (list.size() - 1) / 2; i++) {
            if (!(list.get(i).equals(list.get(list.size() - i - 1))))
                return false;
        }
        return true;
    }

}
