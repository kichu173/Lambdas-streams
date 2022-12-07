package lambdas_streams_ajayIyengar.section1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSolution_concise {
    public static void main(String[] args) {
        // concise code
        // streams is an iterator on steroids that will process each string from the input list.
        List<String> strings = Arrays.asList("Biggest", "at", "ate", "I", "apple", "ball", "cat", "rhino", "series");
        System.out.println(strings.stream().sorted(
                                Comparator.comparing(String::length)
                                        .thenComparing(Comparator.naturalOrder())
                        )
                        .collect(Collectors.toList())
        );
        //[I, at, ate, cat, ball, apple, rhino, series, Biggest]
    }
}
