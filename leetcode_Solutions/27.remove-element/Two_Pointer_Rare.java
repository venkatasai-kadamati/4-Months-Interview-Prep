/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */
// @lc code=start

public int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
    return n;
}

// Function parameter is rate at which occurence of sliding window is estimated
// @lc code=end

// Time Complexity : O(n)