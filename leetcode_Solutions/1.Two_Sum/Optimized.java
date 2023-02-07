
// ! We simply optimize it using a hashmap, as the primary task of lookup arises. 
/* A + B = target
A = target - B
So if B is known we need to simply lookup for A */
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (numToIndex.containsKey(target - nums[i])) {
        return new int[] { numToIndex.get(target - nums[i]), i };
      }
      numToIndex.put(nums[i], i);
    }
    return new int[] {};
  }
}

/*
 * Time complexity: O(N);
 * Space Complexity: O(N);
 */