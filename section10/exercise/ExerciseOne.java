package lambdas_streams_ajayIyengar.section10.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Genre;
import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseOne {
    /*
        Exercise one

      Fetch the list of movies by their Genre.

      Hint - Group movies by genre
    */

    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        Map<Genre, List<Movie>> groupMovieByGenre = movieData.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(groupMovieByGenre);
    }
}
