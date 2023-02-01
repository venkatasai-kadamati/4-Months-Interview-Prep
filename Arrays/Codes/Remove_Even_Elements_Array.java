package Arrays.Codes;

/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// ! Brute force approach
/* Here we are aware of the fact that after removing the even number we will be left with odd numbers and since the new array is created with the size of odd numbers count.
 * Operations 
 * 1. Count -> To count the odd numbers
 * 2. Delete -> Remove and move the elements to new array #Simply create a new array and add while leaving the rest
 */

//  ? Time complexity => Traverse the whole array so O(n)
//  ? Space complexity => Additional array with size k(odd numbers) so O(k)

// @lc code=start
class Solution {
  public static int countOfOddNumbers = 0;

  // Working Function
  public int[] removeElement(int[] nums, int val) {
    int count = countOfOddNumbers(nums);

    int[] result = new int[count];
    int resultIndex = 0;

    for (int index = 0; index < nums.length; index++) {
      if (index % 2 != 0) {
        result[resultIndex++] = nums[index];
      }
    }

    return result;

  }

  // count Function
  private int countOfOddNumbers(int[] nums) {
    for (int element : nums) {
      if (element % 2 != 0) {
        countOfOddNumbers++;
      }
    }
    return countOfOddNumbers;
  }
}
// @lc code=end
