import java.util.*;
import org.apache.commons.collections.map.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
    // Give Input Here
    String given = "Hi hello hi";
    
    // Actual Logic
    solution(given);
    }
    
    
    public static void solution(String given) {
        
        Map<String, Integer> wordCounter = new HashedMap();
        
        // convert string to Array by space
        String[] input = given.split(" ");
        
        // Loop in given word and maintain the counter in map
        for (String i : input) {
            if (wordCounter.containskey(i)) {
                Integer currentCounter = wordCounter.get(i);
                wordCounter.put(i, currentCounter + 1);
            } else {
                wordCounter.put(i, 1);
            }
            
            
            // used LinkedHashMap here so that I can maintain same order and print same as part of output
            LinkedHashMap result = sort(wordCounter);
            
            //prints output
            System.out.System.out.println("result: " +result.toString());
        }
    }
    
  
  // sorting logic using Java8
    private static LinkedHashMap sort(Map<String, Integer> unsorted) {
     return unsorted.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByValue().reversed()).collect(toMap(Map.Entry :: getKey, Map.Entry :: getValue, (e1, e2) -> e1, Link
     ::new));
    }
        

    
}
