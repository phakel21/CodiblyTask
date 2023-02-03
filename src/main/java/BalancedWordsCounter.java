import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BalancedWordsCounter {

    public Integer count(String input) {

        if (input.isEmpty()) {
            return 0;
        }

        if (!input.matches("[a-zA-Z]+")) {
            throw new RuntimeException();
        }

        char[] chars = input.toCharArray();

        Map<Character, Integer> charCount = new HashMap<>();

        for (Character c : chars) {
            if (!charCount.containsKey(c)) {
                charCount.put(c, 1);
            } else {
                charCount.computeIfPresent(c, (k, v) -> v + 1);
            }
        }
        System.out.println(charCount);

        Set<Integer> set = new HashSet<>(charCount.values());
        if (set.size() == 1) {
            return set.stream().findFirst().get();
        }
        throw new RuntimeException("Not balancing");

    }
}
