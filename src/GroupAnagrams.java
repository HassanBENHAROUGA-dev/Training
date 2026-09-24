import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> words = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            words.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }
        return words.values().stream().toList();
    }
}
