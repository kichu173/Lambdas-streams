package lambdas_streams_ajayIyengar.section3.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberFilterTest {
    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1,2,43,5,-234,23,6,7,19);
        getResult(inputList, (number) -> number % 2 == 0);
        getResult(inputList, (number) -> number % 2 != 0);
        getResult(inputList, (number) -> number > 0);
        getResult(inputList, (number) -> number < 0);
        getResult(inputList, (number) -> isPrime(number));
    }

    private static void getResult(List<Integer> inputList, NumberFilter  filter) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for(Integer number : inputList) {
            if(filter.filterNumber(number)) {
                filteredNumbers.add(number);
            }
        }
        System.out.println(filteredNumbers);
    }

    private static boolean isPrime(int number) {
        if(number == 1 || number < 0) return false;
        for(int i = 2; i< Math.sqrt(number);i++) {
            if(number % i  == 0)
                return false;
        }
        return true;
    }
}
