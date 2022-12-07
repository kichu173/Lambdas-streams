package lambdas_streams_ajayIyengar.section8.exercise;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExerciseFive {
    public static void main(String[] args) {
        boolean isValidFile = true;
        String FILE_PATH = "D:\\Java\\TimTest\\src\\lambdas_streams_ajayIyengar\\section8\\exercise\\sample.txt";

        try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH)))
        {
            isValidFile = lines.allMatch(word -> word.startsWith("#") && word.endsWith("#"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Is a valid file ? " + isValidFile);
    }
}
