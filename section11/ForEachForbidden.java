package lambdas_streams_ajayIyengar.section11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachForbidden {
	
	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("abcded","bcdefe","cdedf","def");
		for(int i = 0 ; i < 10 ;i ++) {
			List<String> result = new ArrayList<>();
			data.parallelStream() // data should be processed in parallel(multiple threads are going to execute in our code)
			    .filter(s -> s.length() >3)
			    .forEach(s -> result.add(s)); // collect(Collectors.toList()) and point to result variable List<String> result = data.stream()...
			System.out.println(result);
		}
	}

}
