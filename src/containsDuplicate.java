import java.util.*;

public class containsDuplicate {
    /*public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> duplicate = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            duplicate.put(nums[i], duplicate.getOrDefault(nums[i], 0) + 1);
        }
        return  duplicate.values().stream()
                .anyMatch(key -> key > 1);
    }*/
    /*public boolean containsDuplicate(int[] nums) {

        nums = Arrays.stream(nums)
                .sorted()
                .toArray();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }*/

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        containsDuplicate containsDuplicate = new containsDuplicate();
        int tab[] = {9, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(containsDuplicate.containsDuplicate(tab));
    }
}
