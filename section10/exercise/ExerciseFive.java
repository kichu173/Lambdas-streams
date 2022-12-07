package lambdas_streams_ajayIyengar.section10.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseFive {
    /*Group movies with a rating >= 4 but only names of movies.*/
    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        Map<Integer, List<String>> movieNamesGroupedByRating = movieData.stream()
                .filter(m -> m.getRating() >= 4)
                .collect(Collectors.groupingBy(Movie::getRating,
                        Collectors.mapping(m -> m.getName(), Collectors.toList())));
        System.out.println(movieNamesGroupedByRating);
    }
}
