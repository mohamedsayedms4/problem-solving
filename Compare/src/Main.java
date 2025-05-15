import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        int minLength = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minLength; i++) {
            if (word1.charAt(i) < word2.charAt(i)) {
                System.out.println(word1);
                return;
            } else if (word1.charAt(i) > word2.charAt(i)) {
                System.out.println(word2);
                return;
            }
        }

        // If all characters are equal up to minLength, return the shorter one
        if (word1.length() <= word2.length()) {
            System.out.println(word1);
        } else {
            System.out.println(word2);
        }
    }
}
