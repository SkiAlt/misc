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

        System.out.println("\nnumber of symbols in the alphabet:");
        this.numOfAlphaSymbols = s.nextInt();

        System.out.println("total number of states:");
        this.numOfStates = s.nextInt();

        System.out.println("Trasition table (2D matrix)");
        System.out.printf("%s / %s  | 0 | 1 | 2 |...\n", "States", "Symbols");
        System.out.println("--------------------------------------");
        System.out.printf("%17s | _ | _ | _ |...\n", "q0");
        System.out.printf("%17s | _ | _ | _ |...\n", "q1");
        System.out.printf("%17s | _ | _ | _ |...\n", "q2");
        this.transitionTable = new int[numOfStates][numOfAlphaSymbols];
        for (int i = 0; i < numOfStates; i++)
            for (int j = 0; j < numOfAlphaSymbols; j++)
                this.transitionTable[i][j] = s.nextInt();

        System.out.println("number of final states:");
        int nF = s.nextInt();
        this.FinalStates = new boolean[numOfStates];
        System.out.println("Enter the n final states q(_):");
        for (int i = 0; i < nF; i++) {
            int fs = s.nextInt();
            this.FinalStates[fs] = true;
        }
        
    }

    boolean test (String testString) {
        int currentState = 0;
        for (int i = 0 ; i < testString.length(); i++) {
            int inputSymbol = Character.getNumericValue(testString.charAt(i));
            currentState = transitionTable[currentState][inputSymbol];
        }
        return FinalStates[currentState];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Automaton A = new Automaton();
        int ch = 0;
        do {
            System.out.println("\nInput String:");
            String testString = s.next();

            if(A.test(testString))
                System.out.println("\nAccepted\n");
            else
                System.out.println("\nRejected\n");

            System.out.println("Test One more input string? (1/0)");
            ch = s.nextInt();
        } while (ch == 1);
        s.close();
    }
}