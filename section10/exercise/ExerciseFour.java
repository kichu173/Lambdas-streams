package lambdas_streams_ajayIyengar.section10.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseFour {
    /*We would like to watch movies only with a rating of 4 and 5. Retrieve a list of movie objects with a rating of 4 and 5.

    Hint - Group movies by rating.*/

    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        Map<Integer, List<Movie>> moviesWithGoodRatings = movieData.stream()
                .filter(movie -> movie.getRating() >= 4)
                .collect(Collectors.groupingBy(Movie::getRating));
        System.out.println(moviesWithGoodRatings);
    }
}
