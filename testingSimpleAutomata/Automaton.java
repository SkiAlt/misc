import java.util.Scanner;

public class Automaton {

    // /* Q (set of states) are cosists of q(0) to q(numOfStates - 1) */
    // private int numOfStates;
    // /*
    // * E <sigma> (set of symbols defining the alphabet) are cosists of E(0) to
    // * E(numOfAlphaSymbols - 1)
    // */
    // private int numOfAlphaSymbols;
    // /*
    // * <delta> representing state change is represented by a transition table
    // * describing the "behaviour" of the automaton
    // */
    // private int transitionTable[][];
    // /* State q(0) is considered to be initial state as per convention */

    // /* F[i] = true, when q(i) is one of the final states */
    // private boolean FinalStates[];

    // Automaton() {

    // }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter");

        System.out.println("Input automata design in the form of trasition table matrix");
        System.out.printf("%s / %s  | 0 | 1 | 2 |...\n", "States", "Symbols");
        System.out.println("--------------------------------------");
        System.out.printf("%17s | _ | _ | _ |...\n", "q0");
        System.out.printf("%17s | _ | _ | _ |...\n", "q1");
        System.out.printf("%17s | _ | _ | _ |...\n", "q2");
    }
}