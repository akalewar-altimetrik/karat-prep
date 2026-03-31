import java.util.*;

public class FrequencyBasedSorting {

    public static String frequencyBasedSorting(String str) {
        //"aabbccc"
        Map<Character,Integer> map = new HashMap<>();

        for(Character ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a,b) -> map.get(b) - map.get(a));

        StringBuilder result = new StringBuilder();
        for(char ch : chars){
            int freq = map.get(ch);
            while (freq > 0) {
                freq--;
                result.append(ch);
            }
        }

        return result.toString();
    }
}

