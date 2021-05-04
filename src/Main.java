import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String input = "aaaabbcccd";

    public static void main(String[] args){
        Map<String, Integer> charToOccurence = new HashMap<>();
        for (int i = 0; i < input.length(); i++){
            String letter = String.valueOf(input.charAt(i));
            if (charToOccurence.containsKey(letter)){
                charToOccurence.put(letter, charToOccurence.get(letter) + 1);
            } else {
                charToOccurence.put(letter, 1);
            }
        }
        charToOccurence.entrySet().forEach(entry -> System.out.print(entry.getValue() + entry.getKey()));
    }
}