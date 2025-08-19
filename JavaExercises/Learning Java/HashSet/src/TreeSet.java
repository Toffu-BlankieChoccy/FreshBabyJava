import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;

public class TreeSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(500, 1500, 2000, 2500, 1000, 3000, 2000);

        NavigableSet<Integer> numberTree = new java.util.TreeSet<>(numbers);

        System.out.println(numberTree.higher(150));
//        numberTree.subSet(1750, 2750)
//                .stream()
//                .forEach(System.out::println);

    }
}
