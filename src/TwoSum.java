import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        while (left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left+1, right+1};
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }else if(numbers[left] + numbers[right] > target){
                right--;
            }
        }
        return null;
    }
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//
//            map.put(nums[i], i);
//        }
//
//        return new int[]{};
//    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int tab[] = {1, 2, 3, 4};

        System.out.println(Arrays.toString(twoSum.twoSum(tab, 3)));
    }
}
