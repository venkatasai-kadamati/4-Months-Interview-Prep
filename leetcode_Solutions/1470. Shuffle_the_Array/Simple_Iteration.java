class Solution {
  public int[] shuffle(int[] nums, int n) {
      // Store each y(i) with respective x(i).
      for (int i = n; i < 2 * n; ++i) {
          int secondNum = nums[i] << 10;
          nums[i - n] |= secondNum;
      }

      // '0000000000 1111111111' in decimal.
      int allOnes = (int) Math.pow(2, 10) - 1;

      // We will start putting all numbers from the end, 
      // as they are empty places.
      for (int i = n - 1; i >= 0; --i) {
          // Fetch both the numbers from the current index.
          int secondNum = nums[i] >> 10;
          int firstNum = nums[i] & allOnes;
          nums[2 * i + 1] = secondNum;
          nums[2 * i] = firstNum;
      }
      return nums;
  }
}