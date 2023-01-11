package Learning_Notes.Recursion_BackTracking.Codes;

// ? Tower of Hanoi code => The main agenda is to know the code structure for it.
public class TowerOfHanoi {
    public static void main(String[] args) {
        tower(3, 'A', 'C', 'B');
    }

    public static void tower(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.print("Move peg1" + "from Peg " + fromPeg + "to Peg" + toPeg);
            return;
        }

// ! The logic behind the tower of hanoi is simply to consider the n pegs as 1 + (n-1) pegs and solve recursively.
//        ** Statements are
//        A -> B With C as aux =>> We move the n-1 pegs to B
//        A -> C With B as aux =>> We move the remaining 1 pegs or so to C
//        B -> C With A as aux =>> We move the earlier moved n-1 pegs to C

        tower(n - 1, 'A', 'B', 'C');
        System.out.print("Move peg" + "from Peg" + fromPeg + "to Peg" + toPeg);
        tower(n - 1, 'B', 'C', 'A');
    }
}
