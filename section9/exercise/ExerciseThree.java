package lambdas_streams_ajayIyengar.section9.exercise;

import lambdas_streams_ajayIyengar.section7.exercise.Movie;
import lambdas_streams_ajayIyengar.section7.exercise.MovieUtil;

import java.util.List;

public class ExerciseThree {
    public static void main(String[] args) {
        List<Movie> movieData = MovieUtil.getMovieData();
        long totalMoney = movieData.stream()
                .filter(m -> m.getDirectorName().equals("Martin Scorsese"))
                .mapToLong(m -> m.getGrossEarning())
                .sum();
        System.out.println(totalMoney);
    }
}
