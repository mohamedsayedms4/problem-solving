import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // عدد العناصر
        int q = in.nextInt(); // عدد الاستعلامات
        Vector<Integer> vector = new Vector<>();

        // قراءة عناصر المصفوفة
        for (int i = 0; i < n; i++) {
            vector.add(in.nextInt());
        }

        // تنفيذ الاستعلامات
        in.nextLine(); // لالتقاط السطر الفارغ
        while (q-- > 0) {
            String line = in.nextLine();
            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "pop_back":
                    vector.remove(vector.size() - 1);
                    break;

                case "front":
                    System.out.println(vector.firstElement());
                    break;

                case "back":
                    System.out.println(vector.lastElement());
                    break;

                case "sort": {
                    int l = Integer.parseInt(parts[1]) - 1;
                    int r = Integer.parseInt(parts[2]);
                    List<Integer> sub = vector.subList(l, r);
                    Collections.sort(sub);
                    break;
                }

                case "reverse": {
                    int l = Integer.parseInt(parts[1]) - 1;
                    int r = Integer.parseInt(parts[2]);
                    List<Integer> sub = vector.subList(l, r);
                    Collections.reverse(sub);
                    break;
                }

                case "print": {
                    int pos = Integer.parseInt(parts[1]) - 1;
                    System.out.println(vector.get(pos));
                    break;
                }

                case "push_back": {
                    int x = Integer.parseInt(parts[1]);
                    vector.add(x);
                    break;
                }
            }
        }
    }
}
