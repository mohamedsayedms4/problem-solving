import java.util.Scanner;
/**
 * Given two strings S and T. Print a new string that contains the following:
 *
 * The first letter of the string S followed by the first letter of the string T.
 * the second letter of the string S followed by the second letter of the string T.
 * and so on...
 * In other words, the new string should be ( S0 + T0 + S1 + T1 + .... ).
 * Note: If the length of S is greater than the length of T then you have to add the rest of S letters at the end of the new string and vice versa.
 *
 * Input
 * The first line contains a number N (1 ≤ N ≤ 50) the number of test cases.
 *
 * Each of the N following lines contains two string S, T (1 ≤ |S|, |T| ≤ 50) consists of lower and upper English letters.
 *
 * Output
 * For each test case, print the required string.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases-- > 0) {
            String[] parts = sc.nextLine().split(" ");
            String s = parts[0];
            String t = parts[1];

            String result = "";

            int maxLen = Math.max(s.length(), t.length());

            for (int i = 0; i < maxLen; i++) {
                if (i < s.length()) result += s.charAt(i);
                if (i < t.length()) result += t.charAt(i);
            }

            System.out.println(result);
        }
    }
}
