import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long size = in.nextLong();
        long teams = in.nextLong();

        long [] array = new long[(int)size];

        Map<Long,Long> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            array[i] = in.nextLong();
            if (!map.containsKey(array[i])) {
                map.put(array[i], (long)i+1);
            }
        }

        if (map.size() < teams) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
            int count = 0;
            for(long index : map.values()) {
                System.out.print(index+" ");
                count++;
                if (count == teams) break;
            }
        }


    }
}