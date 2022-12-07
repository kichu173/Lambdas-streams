package lambdas_streams_ajayIyengar.section11.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciseTwo {
    /*Find a unique list of stars who have acted in Martin Scorsese movies*/
    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        Set<String> martinScorsese = movieData.stream()
                .filter(m -> m.getDirectorName().equals("Martin Scorsese"))
                .flatMap(m -> m.getCast().stream())
                .collect(Collectors.toSet());
        System.out.println(martinScorsese);
    }
}
