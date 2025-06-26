import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int query = in.nextInt();
        in.nextLine();

        StringBuilder value = new StringBuilder(in.nextLine());

        while (query-- > 0) {
            String qu = in.next();

            if (qu.equals("pop_back")) {
                value.deleteCharAt(value.length() - 1);

            } else if (qu.equals("front")) {
                System.out.println(value.charAt(0));

            } else if (qu.equals("back")) {
                System.out.println(value.charAt(value.length() - 1));

            } else if (qu.equals("sort")) {
                int a = in.nextInt();
                int b = in.nextInt();
                int l = Math.min(a, b) - 1;
                int r = Math.max(a, b);

                char[] segment = value.substring(l, r).toCharArray();
                Arrays.sort(segment);
                for (int i = l, j = 0; i < r; i++, j++) {
                    value.setCharAt(i, segment[j]);
                }

            } else if (qu.equals("reverse")) {
                int a = in.nextInt();
                int b = in.nextInt();
                int l = Math.min(a, b) - 1;
                int r = Math.max(a, b) - 1;
                while (l < r) {
                    char temp = value.charAt(l);
                    value.setCharAt(l, value.charAt(r));
                    value.setCharAt(r, temp);
                    l++;
                    r--;
                }

            } else if (qu.equals("print")) {
                int pos = in.nextInt();
                System.out.println(value.charAt(pos - 1));

            } else if (qu.equals("substr")) {
                int a = in.nextInt();
                int b = in.nextInt();
                int l = Math.min(a, b) - 1;
                int r = Math.max(a, b);
                System.out.println(value.substring(l, r));

            } else {
                // push_back
                char c = in.next().charAt(0);
                value.append(c);
            }
        }
    }
}
