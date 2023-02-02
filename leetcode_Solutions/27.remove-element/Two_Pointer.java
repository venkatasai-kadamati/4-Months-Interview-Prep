/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// ! Optimized - Two Pointer (inplace)

//  ? Time complexity => Traverse the whole array so O(n)
//  ? Space complexity => Additional array with size k(odd numbers) so O(1)

// Corner cases - If nums is empty/ If len is < 1 return len;

// @lc code=start
class Solution {
  public int removeElement(int[] nums, int val) {
    // corner case
    if (nums == null) {
      throw new IllegalArgumentException("Input is invalid");
    }

    int len = nums.length;
    if (len <= 1) {
      return len;
    }
    
    int countIndex = 0;

    for (int traversalIndex = 0; traversalIndex < nums.length; traversalIndex++) {
      if (nums[traversalIndex] != val) {
        nums[countIndex] = nums[traversalIndex];
        countIndex++;
      }
    }
    return countIndex;

  }
}

// @lc code=end
