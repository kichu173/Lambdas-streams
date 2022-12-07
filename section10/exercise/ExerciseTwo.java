package lambdas_streams_ajayIyengar.section10.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseTwo {
    /*
    Find the number of movies released in each year

    Output - {2003=1, 2019=2, 2020=2, 2006=2, 1976=1, 1979=1, 2013=1, 1982=1, 1999=1}
    */

    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        Map<Integer, Long> noOfMoviesInYear = movieData.stream()
                .collect(Collectors.groupingBy(
                                m -> m.getDateOfRelease().getYear(),
                                Collectors.counting()
                        )
                );
        System.out.println(noOfMoviesInYear);
    }
}
