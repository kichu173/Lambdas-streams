package lambdas_streams_ajayIyengar.section8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstEncounterOrder {
	
	public static void main(String[] args) {
		
		List<Integer> numbersList = Arrays.asList(5,1022,23,324,61,2);
		System.out.println("List elements " + numbersList);
		
		Optional<Integer> element = numbersList.stream()
				                               .filter(n -> n%2 == 0)
									           .findFirst();
		
		System.out.println("From list : " +element.orElseThrow(() -> new NoSuchElementException("no element found")));
		
		Set<Integer> numbersSet = Stream.of(5,1022,23,324,62,2).collect(Collectors.toSet());

		System.out.println("Set elements " + numbersSet);
		Optional<Integer> elementSet = numbersSet.stream()
				                                 .sorted()
												 .filter(n -> n%2 == 0)
				                                 .findFirst();
		System.out.println("From set : " +elementSet.orElseThrow(() -> new NoSuchElementException("no element found")));

	}

}
