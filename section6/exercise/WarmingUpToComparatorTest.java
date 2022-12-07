package lambdas_streams_ajayIyengar.section6.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WarmingUpToComparatorTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("i", "am", "we", "learning", "lambdas");

        // Anonymous class
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() < s2.length() ? -1 : 1;
            }
        });
        System.out.println(strings);

        System.out.println("------");
        // lambda expression
        strings.sort((s1, s2) -> Integer.compare(s1.length(),s2.length()));
        System.out.println(strings);

        System.out.println("------");

        // Use Comparator.comparing method
        strings.sort(Comparator.comparing((s) -> s.length()));
        System.out.println(strings);

        System.out.println("------");

        // Use Method reference
        strings.sort(Comparator.comparing(String::length));
        System.out.println(strings);
    }
}
