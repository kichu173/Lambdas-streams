package lambdas_streams_ajayIyengar.section12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;


public class DictionaryFirstAnyParallel {
	
	//change as per location.
	private static String FILE_PATH = "D:\\Java\\Lambdas-streams\\src\\streams\\ch08\\dictionary.txt";
	
	public static void main(String[] args) throws IOException {
				
		//Find a word that starts with 'a',greater than 10 characters,convert to uppercase.
		String firstLetter = "a"; 
		findWordStartingFrom(firstLetter);	   
	}

	public static void findWordStartingFrom(String firstLetter) throws IOException {
		
		try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH)))
		{
			Optional<String> anyLargeWord = 
										lines.parallel()
										     .filter(word -> word.startsWith(firstLetter))
					 					     .filter(word -> word.length() > 10)
					 					     .map(word -> word.toUpperCase())
					 					     .findAny(); //.findFirst() works well with parallel() but no better performance to use.


			System.out.println(anyLargeWord.orElse("No word starting "
					+ "from "+firstLetter+"found..."));
		}		
	}
}
