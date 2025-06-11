import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> frequency = new HashMap<Integer,Integer>();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int quires = in.nextInt();

        for (int i = 0; i < quires; i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (num1 == 1) {
                frequency.put(num2, frequency.getOrDefault(num2, 0) + 1);
            } else if (num1 == 2) {
                System.out.println(frequency.getOrDefault(num2, 0));
            }
        }
    }
}
