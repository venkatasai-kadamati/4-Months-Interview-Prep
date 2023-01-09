package Learning_Notes.Stacks;

import java.util.ArrayList;

public class StackImplementationUsingArrayList {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);

//        ** To print the values of the stack
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
        st.print();

    }

    static class Stack {
        //        ! Implementation using ArrayList
        ArrayList<Integer> s = new ArrayList<>();

        //        ** isEmpty
        boolean isEmpty() {
            return s.size() == 0;
        }

        // ** Peek Method
        int peek() {
            return s.get(s.size() - 1);
        }

        // ** Push Method
        void push(int data) {
            s.add(data);
        }

        // ** Pop Method
        int pop() {
            int x = s.get(s.size() - 1);
            s.remove(s.size() - 1);
            return x;

        }

        // ** Print Method
        void print() {
            if (isEmpty()) {
                return;
            }
            for (int i : s) {
                System.out.println(i);
            }
        }

    }
}
