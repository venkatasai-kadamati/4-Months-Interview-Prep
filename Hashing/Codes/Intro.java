package Hashing.Codes;

import java.util.*;

// ? Find the frequency of the element in a array
class Intro {
  public static void main(String[] args) {

    int arr[] = { 8, 3, 5, 2, 3, 1, 6, 5, 7, 4, 3, 1, 4 };

    // Scanner sc = new Scanner(System.in);

    bruteForceApproach(arr, 6);
  }

  private static void bruteForceApproach(int[] arr, int element) {
    // ! Naive traversal by fixation
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        count++;
      }
    }
    System.out.println(count);
  }
}

// ** The time complexity is O(n x q) for q queries
// ** Space complexity is uneffected.