import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String hello = "hello";

        int i = 0; // index in s
        int j = 0; // index in "hello"

        while (i < s.length() && j < hello.length()) {
            if (s.charAt(i) == hello.charAt(j)) {
                j++;
            }
            i++;
        }

        if (j == hello.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
