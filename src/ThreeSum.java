import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> possibilities = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i+1, right = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            while(left < right){
                int value = -nums[i];
                if (nums[left] + nums[right] == value) {
                    possibilities.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if(nums[left] + nums[right] < value){
                    left++;
                }else if(nums[left] + nums[right] > value){
                    right--;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(possibilities);


        return result;
    }
    public static void main(String[] args) {
        int tab[] = {-100,-70,-60,110,120,130,160};
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(tab));
    }
}
