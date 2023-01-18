package Learning_Notes.Stacks.Codes;

import java.util.Stack;

// ? Push at bottom question - Amazon
public class PushAtBottom {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pAB(s, 4);

    }

    public static void pAB(Stack<Integer> s, int data) {
//        ! The logic here is to use recursion as one needs to get removed and rejoined again by itself knowing its position.
//        ** Time complexity is O(n) and no extra space is taken, as we will use the call stack to perform recursive actions.
//        ** First it needs to get the top data

        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pAB(s, data);
        s.push(top);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
            s.pop();
        }
    }
}
