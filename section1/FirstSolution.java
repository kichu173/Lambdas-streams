package lambdas_streams_ajayIyengar.section1;

import java.util.*;

public class FirstSolution {
    // group strings based on length (verbose code)
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Biggest","at", "ate", "I","apple","ball","cat","rhino","series");
        Map<Integer, List<String>> lengthMap = new HashMap<>();
        for(String string: strings) {
            List<String> sameLength = null;
            Integer length = string.length();

            if(lengthMap.get(length) == null) {
                sameLength = new ArrayList<>();
                lengthMap.put(length, sameLength);
            } else {
                sameLength = lengthMap.get(length);
            }
            sameLength.add(string);
        }
        System.out.println(lengthMap);// {1=[I], 2=[at], 3=[ate, cat], 4=[ball], 5=[apple, rhino], 6=[series], 7=[Biggest]}
    }
}
