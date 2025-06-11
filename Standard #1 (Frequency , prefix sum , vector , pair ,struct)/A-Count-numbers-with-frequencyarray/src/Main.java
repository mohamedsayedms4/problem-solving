import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] frequency = new int[100001]; // حجم أكبر بقليل تحسبًا لقيمة n = 100000
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int quires = in.nextInt();

        for (int i = 0; i < quires; i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (num1 == 1) {
                frequency[num2]++;
            } else if (num1 == 2) {
                System.out.println(frequency[num2]);
            }
        }
    }
}
