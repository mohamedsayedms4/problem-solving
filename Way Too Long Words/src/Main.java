import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            String word = sc.next();
            if (word.length() <= 10) {
                System.out.println(word);
            } else {
                int middleCount = word.length() - 2;
                System.out.println("" + word.charAt(0) + middleCount + word.charAt(word.length() - 1));
            }
        }
    }
}
