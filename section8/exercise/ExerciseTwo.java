package lambdas_streams_ajayIyengar.section8.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class ExerciseTwo {
    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();

        Movie movie = movieData.stream()
                .filter(m -> m.getName().contains("Rocky"))
                .sorted(Comparator.comparing(Movie::getDateOfRelease))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No data found"));

        System.out.println(movie);

        boolean willSmithMovie2020 = movieData.stream()
                .filter(m -> m.getDateOfRelease().getYear() == 2020)
                .anyMatch(m -> m.getCast().contains("Will Smith"));

        System.out.println(willSmithMovie2020);

    }
}
