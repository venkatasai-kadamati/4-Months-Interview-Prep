package Hashing.Codes;
// ? Given an array of integers arr and a positive integer m, your task is
/* to find the frequency of the most common element within each contiguous subarray of length m in arr.
Return an array of these highest frequencies among subarray elements, ordered by their corresponding subarray's starting index.

Input: [1,2,3,1,2,4,1,4,4], m = 4
Output: [2,2,1,2,2,3]

Input:[1,2], m = 2
Output:[1] */

// ** https://leetcode.com/discuss/interview-question/1188820/facebook-onsite-interview-how-to-solve-optimally

public static List<Integer> getMaxFreq(List<Integer> input, int k) {
  List<Integer> res = new ArrayList<>();
  // Map to frequency of each element in the window
  Map<Integer, Integer> freq = new HashMap<>();
  // Tree map to get highest frequency with O(logn)
  TreeMap<Integer, Set<Integer>> maxFreq = new TreeMap<>();
  for (int i=0; i<input.size(); i++) {
      // Store frequency of a number in the window in both the maps
      int currEleFreq = freq.getOrDefault(input.get(i), 0);
      if (maxFreq.getOrDefault(currEleFreq + 1, new HashSet<>()).size() == 0) {
          maxFreq.put(currEleFreq + 1, new HashSet<>());
      }
      maxFreq.get(currEleFreq + 1).add(input.get(i));
      freq.put(input.get(i), currEleFreq + 1);
      // If curr index is greater than given, remove first element from window and reduce its frequency
      if (i >= k) {
          int lastEleFreq = freq.get(input.get(i - k));
          maxFreq.get(lastEleFreq).remove(input.get(i - k));
          if (maxFreq.get(lastEleFreq).size() == 0) {
              maxFreq.remove(lastEleFreq);
          }
          freq.put(input.get(i - k), lastEleFreq - 1);
      }
      // Add greatest key from treemap to the result
      if (i >= k-1) {
          res.add(maxFreq.lastKey());
      }
  }
  return res;
}