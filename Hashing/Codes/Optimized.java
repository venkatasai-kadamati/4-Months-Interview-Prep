package Hashing.Codes;

import java.util.*;

class Optimized {
  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    Map<Integer, Integer> hmap = new HashMap<>();
    for (int num : arr) {
      if (hmap.containsKey(num)) {
        int val = hmap.get(num);
        hmap.put(num, val + 1);
      } else {
        hmap.put(num, 1);
      }
    }
    int Q = scn.nextInt(); // For Q queries
    while (Q > 0) {
      int X = scn.nextInt();
      for (Integer key : hmap.keySet()) {
        if (key == X) {
          System.out.println(hmap.get(key));
          break;
        }
      }
      Q--;
    }
  }
}