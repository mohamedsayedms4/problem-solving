import com.sun.net.httpserver.Headers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Helper{
        String name;
        int arabic, math, science, english;
        int total;

        public Helper(String name, int a, int m, int s, int e) {
            this.name = name;
            this.arabic = a;
            this.math = m;
            this.science = s;
            this.english = e;
            this.total = a + m + s + e;
        }
    }
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Helper> l = new ArrayList<Helper>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int a = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int e = in.nextInt();
            l.add(new Helper(name, a, m, s, e));
        }

        l.sort((f1, f2) -> {
            if (f2.total != f1.total)
                return Integer.compare(f2.total, f1.total);
            return f1.name.compareTo(f2.name);
        });

        for (Helper f : l) {
            System.out.println(f.name + " " + f.total + " " + f.arabic + " " + f.math + " " + f.science + " " + f.english);
        }
    }
}