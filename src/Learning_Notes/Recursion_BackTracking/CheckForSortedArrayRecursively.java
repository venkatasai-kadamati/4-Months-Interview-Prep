package Learning_Notes.Recursion_BackTracking;

// ? Given an array, check whether the array is in sorted order with recursion.
public class CheckForSortedArrayRecursively {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 6, 2};
        isSortedArray(arr, 0);
    }

    private static int isSortedArray(int arr[], int n) {
        // ! base case if there is no other element to compare and sort.
        if (arr.length == 1) {
            return 1;
        }
//        ** Suggestion : Use ternary operators in recursive codes
        return (arr[n - 1] < arr[n - 2]) ? 0 : isSortedArray(arr, n - 1);

    }
}
