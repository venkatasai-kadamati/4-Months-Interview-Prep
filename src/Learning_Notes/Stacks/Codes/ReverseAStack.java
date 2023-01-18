package Learning_Notes.Stacks.Codes;

import java.util.Stack;

// ? Reverse a stack
public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s);
        reverseStack(s);
        printStack(s);
    }

    private static void printStack(Stack<Integer> s) {
        while(s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    private static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    //    ! Approach - 1 : We can use an additional stack{ll,al} but it uses up extra memory
    //    ! Approach - 2 : Since the alternative need for no extra memory arises we simply use recursion, here we can use the pushAtBottom method to reverse the stack.

    //    ** pushAtBottom is a recursive function as it needs to get called itself while getting removed and re-added accordingly.
    //    ** In a recursive look for the simplest method which is the base case.
    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);

    }
}
