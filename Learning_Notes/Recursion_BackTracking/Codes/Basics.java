package Learning_Notes.Recursion_BackTracking.Codes;

// ? Factorial Problem in recursive and Iterative manner.

// ? Print the values before n number in recursive manner / could have used for/ while loop
public class Basics {
    public static void main(String[] args) {
        // Recursive call
        System.out.println(FactorialRecursive(5));
        // Iterative Call
        System.out.println(factorialIterative(4));
        // Print Number
        System.out.println(printNumber(5));

    }

    // printNumber call
    private static int printNumber(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return printNumber(n - 1);
        }
    }

    // Recursive Code
    private static int FactorialRecursive(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * FactorialRecursive(n - 1);
        }
    }

    private static int factorialIterative(int n) {
        int fact = 1;
        while (n != 0) {
            fact *= (n);
            n--;
        }
        return fact;
    }

}
