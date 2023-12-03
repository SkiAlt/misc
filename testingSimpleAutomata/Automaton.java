import java.util.Scanner;

public class Automaton {

    /* Q (set of states) represented by q(0) to q(numOfStates - 1) */
    private int numOfStates;
    /*
     * E <sigma> (set of symbols defining the alphabet) represnted by E(0) to
     * E(numOfAlphaSymbols - 1)
     */
    private int numOfAlphaSymbols;
    /*
     * <delta> representing state change is represented by a transition table
     * describing the "behaviour" of the automaton
     */
    private int transitionTable[][];
    /* State q(0) is considered to be initial state as per convention */

    /* F[i] = true, when q(i) is one of the final states */
    private boolean FinalStates[];

    Automaton() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of symbols in the alphabet:");
        this.numOfAlphaSymbols = s.nextInt();

        System.out.println("Enter the total number of states:");
        this.numOfStates = s.nextInt();

        System.out.println("Input automata design in the form of trasition table (2D matrix)");
        System.out.printf("%s / %s  | 0 | 1 | 2 |...\n", "States", "Symbols");
        System.out.println("--------------------------------------");
        System.out.printf("%17s | _ | _ | _ |...\n", "q0");
        System.out.printf("%17s | _ | _ | _ |...\n", "q1");
        System.out.printf("%17s | _ | _ | _ |...\n", "q2");
        this.transitionTable = new int[numOfStates][numOfAlphaSymbols];
        for (int i = 0; i < numOfStates; i++)
            for (int j = 0; j < numOfAlphaSymbols; j++)
                this.transitionTable[i][j] = s.nextInt();

        System.out.println("Enter the number of final states:");
        int nF = s.nextInt();
        this.FinalStates = new boolean[numOfStates];
        System.out.println("Enter the n final states q(_):");
        for (int i = 0; i < nF; i++) {
            int fs = s.nextInt();
            this.FinalStates[fs] = true;
        }
        s.close();
    }

    public static void main(String[] args) {
        Automaton A = new Automaton();

    }
}