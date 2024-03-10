import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2]; // initialize an array with two elements
    HashMap<Integer, Integer> hashMapNumber = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (!hashMapNumber.containsKey(target - nums[i])) {
        hashMapNumber.put(nums[i], i);
      } else {
        result[1] = i;
        result[0] = hashMapNumber.get(target - nums[i]);
      }
    }
    return result;
  }
}