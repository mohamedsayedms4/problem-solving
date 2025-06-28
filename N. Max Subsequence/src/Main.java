/**
 * Given a number N
 *  and a string S
 *  of size N
 * . Determine the maximum possible size of the sub-sequence T
 *  derived from S
 *  such that no two adjacent characters in T
 *  are the same.
 *
 * Note: A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.
 *
 * For example: The list of all subsequence for the word "apple" would be "a", "ap", "al", "ae", "app", "apl", "ape", "ale", "appl", "appe", "aple", "apple", "p", "pp", "pl", "pe", "ppl", "ppe", "ple", "pple", "l", "le", "e".
 *
 * Input
 * The first line contains a number N
 *  (1≤N≤105)
 *  denoting the size of the string.
 *
 * The second line contains a string S
 *  consists of lowercase English letters.
 *
 * Output
 * Print a single line containing one number that represents the maximum size of the subsequence that satisfies the provided condition.
 * Examples
 * Input
 * 5
 * ababb
 * Output
 * 4
 * Input
 * 5
 * aaaac
 * Output
 * 2
 * */


import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int count = 0;
        char prev =0;

        for (int i = 0; i < n ; i++) {

            char current = s.charAt(i);
            if(0== i || current!= prev){
                count++;
                prev = current;
            }
        }
        System.out.println(count);

    }
}