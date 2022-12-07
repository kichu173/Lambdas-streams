package lambdas_streams_ajayIyengar.section8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAnyEncounter {
	public static void main(String[] args) {
		
		//If the stream has no encounter order, then any element may be returned
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Encounter Order List "+numberList);

		Optional<Integer> firstEven = numberList.stream()
								                .filter( n -> n % 2 == 0)
		                                        .findAny();
		
		System.out.println("Number list : " + firstEven.orElse(0));
		
		Set<Integer> numberSet = Stream.of(1,2,3,4,5,6,7,8,9,10).collect(Collectors.toSet());
		System.out.println("Encounter Order Set"+numberSet);
		
		Optional<Integer> firstEvenSet = numberSet.stream()
												  .peek(System.out::println)
								                  .filter( n -> n % 2 == 0)
		                                          .findAny();
		
		System.out.println("Number Set : " + firstEvenSet.orElse(0));
		
	
	}

}
