package lambdas_streams_ajayIyengar.section9.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.time.LocalDate;
import java.util.List;

public class ExerciseFour {
    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        long count = movieData.stream()
                .filter(m -> m.getDateOfRelease().isAfter(LocalDate.now().minusYears(10)))
                .count();
        System.out.println(count);
    }
}
