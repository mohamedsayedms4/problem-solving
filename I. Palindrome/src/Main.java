 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

 import java.util.Scanner;

 /**
 * Given a string S. Determine whether S is Palindrome or not

Note: A string is said to be a palindrome if the reverse of the string is same as the string. For example, "abba" is palindrome, but "abbc" is not palindrome.

Input
Only one line contains a string S (1 ≤ |S| ≤ 1000) where |S| is the length of the string and it consists of lowercase letters only.

Output
Print "YES" if the string is palindrome, otherwise print "NO".
  */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}