package lambdas_streams_ajayIyengar.section9.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ExerciseOne {
    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        Optional<Movie> max = movieData.stream()
                .max(Comparator.comparing(Movie::getGrossEarning));
        System.out.println(max.orElseThrow(() -> new NoSuchElementException("No movie found")));
    }
}
