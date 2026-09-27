import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FirstUniqueNumber {
    Optional<Integer> firstUnique(List<Integer> numbers) {
        Map<Integer, Integer> replicas = new HashMap<>();

        for (Integer n : numbers) {
            replicas.put(n, replicas.getOrDefault(n, 0) + 1);
        }

        for (Integer n : numbers) {
            if (replicas.get(n) == 1) {
                return Optional.of(n);
            }
        }

        return Optional.empty();
    }
    public static void main(String[] args) {

    }
}
