package lambdas_streams_ajayIyengar.section1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSolution {
    public static void main(String[] args) {
        // Verbose code
        List<String> strings = Arrays.asList("Biggest","at", "ate", "I","apple","ball","cat","rhino","series");
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                } else if (s1.length() < s2.length()) {
                    return -1;
                }
                return s1.compareTo(s2);// compares two strings alphabetically/lexicographically (invoke string class compareTo method)
            }
        });
        System.out.println(strings);// [I, at, ate, cat, ball, apple, rhino, series, Biggest]
    }
}
