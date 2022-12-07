package lambdas_streams_ajayIyengar.section12;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.LongStream;

public class AddMillionNumbers {
	
	public static void main(String[] args) {
		
		sequentialSum();
		streamAtomicLongSum();
		streamReduceSum();		
	}
	
	public static void sequentialSum() {
		//accumulator
		long sum = 0L;
		//sequencing
		for(long i = 1 ; i <= 100_000_000;i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("Sequential sum is : " +sum);
	}
	
	public static void streamAtomicLongSum() {
		//Thread safe, but lot of memory access.
		AtomicLong sum = new AtomicLong(0L);
		
		LongStream.rangeClosed(1, 100_000_000) //100Million
		          .parallel()
		          .forEach(val -> sum.addAndGet(val));
		
		System.out.println("Sum using AtomicLong is : " +sum.get());
	}

	//reduction
	public static void streamReduceSum() {

		long sum = LongStream.rangeClosed(1, 100_000_000)
				             .parallel()
		                     .reduce(0,Long::sum); // reduce operation is immutable(parallelize's well)
		
		System.out.println("Streams sum using reduce : " +sum);
	}
}
