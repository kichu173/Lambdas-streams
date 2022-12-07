package lambdas_streams_ajayIyengar.section8.exercise;

import java.util.Arrays;
import java.util.List;

public class ExerciseOne {
    public static void main(String[] args) {
        List<String> articles = Arrays.asList("the","a","an");

        List<String> input = Arrays.asList("software", "programmer", "i", "am", "a", "java", "the");

        String s = input.stream()
                .filter(i -> articles.contains(i))
                .findFirst()
                .map(str -> str.toUpperCase())
                .orElse("Not found");
        System.out.println(s);
    }
}
