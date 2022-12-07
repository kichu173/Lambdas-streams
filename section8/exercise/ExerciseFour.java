package lambdas_streams_ajayIyengar.section8.exercise;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExerciseFour {
    public static void main(String[] args) {
        String pass = "Password"; //"Kichu" returns true
        boolean isValidPassword = true;

        String FILE_PATH = "D:\\Java\\TimTest\\src\\lambdas_streams_ajayIyengar\\section8\\exercise\\invalidpasswords.txt";

        try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH)))
        {
            isValidPassword = lines.noneMatch(line -> line.equals(pass));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Is a valid password ? "+ isValidPassword);
    }
}
