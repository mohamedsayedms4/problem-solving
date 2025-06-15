import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int q = in.nextInt();

        TreeMap<Integer, Boolean> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            map.put(val, true);
        }

        for (int i = 0; i < q; i++) {
            int x = in.nextInt();

            int less = map.headMap(x, false).size();
            int greater = map.tailMap(x + 1, true).size();
            System.out.println(less + " " + greater);
        }
    }
}
