package Learning_Notes.Stacks.Codes;

import java.util.Stack;

// ? Reverse a string - microsoft, flipkart
public class ReverseString {
    //    abc ->> cba => stack property LIFO
    public static void main(String[] args) {
        String reversedString = reverseString("abcde");
        System.out.println(reversedString);
    }

    private static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (str.length() > i) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char current = s.pop();
            result.append(current);
        }
        return result.toString();
    }

}
