package lambdas_streams_ajayIyengar.section9.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ExerciseTwo {
    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        Optional<Movie> movieLowGross = movieData.stream()
                .filter(movie -> movie.getDateOfRelease().getYear() == 2020)
                .min(Comparator.comparing(Movie::getGrossEarning));
        System.out.println(movieLowGross.orElseThrow(() -> new NoSuchElementException("No movie found")));
    }
}
