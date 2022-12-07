package lambdas_streams_ajayIyengar.section10.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Genre;
import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseThree {
    /*Find the gross earning of movies classified by genre

    Output - {HORROR=50000000, SUPERHERO=3000000000, COMEDY=533000000, ACTION=1693099584, CRIME=683000000}*/

    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        Map<Genre, Long> moviesBasedOnGenreWithEarnings = movieData.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,
                                Collectors.summingLong(Movie::getGrossEarning)
                        )
                );
        System.out.println(moviesBasedOnGenreWithEarnings);
    }
}
