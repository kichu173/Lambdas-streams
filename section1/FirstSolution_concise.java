package lambdas_streams_ajayIyengar.section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstSolution_concise {
    public static void main(String[] args) {
        // group strings based on length (concise code)
        List<String> strings = Arrays.asList("Biggest","at", "ate", "I","apple","ball","cat","rhino","series");
        System.out.println(strings.stream()
                .collect(Collectors.groupingBy(String::length)));
        // {1=[I], 2=[at], 3=[ate, cat], 4=[ball], 5=[apple, rhino], 6=[series], 7=[Biggest]}
    }
}
