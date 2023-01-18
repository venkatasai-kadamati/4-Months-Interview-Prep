package Learning_Notes.SlidingWindow.Codes;

// ? Find Sum Of All Contiguous Subarrays Of Size K
// ?
public class SlidingWindowBasics {
    public static void main(String[] args) {
        int[] arr = { 1, 5, -1, 6, 3, 2 };
        // bruteForce(arr, 3);
        // slidingWindow(arr, 3);
        maxSum(arr, 3);
        maxSum2(arr, 3);
    }

    // ! Maximum sum of subarray of size K

    public static void maxSum(int arr[], int k) {
        int n = arr.length;
        int sum = 0;
        // ** Here the outer loop defines the boundary to check and traverse until,
        // since n-k is inclusive thus we use <=.
        // ** The inner loop defines the range of sum, since we want 3 digits in array,
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
                System.out.println(sum);

                int max = 9000;
                if (max < sum) {
                    max = sum;
                }
                System.out.println(max);
            }
        }
    }

    // ! Maximum sum of subarray of size k
    public static void maxSum2(int arr[], int k) {
        int n = arr.length;
        int sum = 0;
        // ** Here the outer loop defines the boundary to check and traverse until,
        // since n-k is inclusive thus we use <=.
        // ** The inner loop defines the range of sum, since we want 3 digits in array,
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
                System.out.println(sum);

                int max = 9000;
                if (max < sum) {
                    max = sum;
                }
                System.out.println(max);
            }
        }
    }

    // ! Brute force approach
    public static void bruteForce(int arr[], int k) {
        int n = arr.length;
        int sum = 0;
        // ** Here the outer loop defines the boundary to check and traverse until,
        // since n-k is inclusive thus we use <=.
        // ** The inner loop defines the range of sum, since we want 3 digits in array,
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
                System.out.println(sum);
            }
        }
    }

    // ! Sliding window Approach
    private static void slidingWindow(int[] arr, int k) {
        // ** The idea is to move linearly by substracting the uncommon element of the
        // three. While iteration 1, 5, -1 & Further 5, -1, 6 we find that 5, -1 is
        // common and we simply add 6 and remove 1.
        int n = arr.length;
        int sum = arr[0] + arr[1] + arr[2];
        System.out.println(sum);
        for (int i = 1; i < n - k + 1; i++) {
            sum = (sum - arr[i - 1]) + arr[i + k - 1];
            System.out.println(sum);
        }

        // ** Optimized by O(n) time complexity.
    }
}
