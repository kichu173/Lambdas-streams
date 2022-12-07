package lambdas_streams_ajayIyengar.section11.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.List;
import java.util.stream.Collectors;

public class ExerciseOne {
    /*Find a list of stars who have acted in Martin Scorsese movies

    Output must be a List<String>*/
    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        List<String> startCastInMartinScorsese = movieData.stream()
                .filter(m -> m.getDirectorName().equals("Martin Scorsese"))
                .flatMap(m -> m.getCast().stream())
                .collect(Collectors.toList());
        System.out.println(startCastInMartinScorsese);
    }
}
