import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long size = in.nextLong();
        Map <String,Long>map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            String name = in.next();

            Long salary = in.nextLong();
            map.put(name,salary);
        }

        List<Map.Entry<String,Long>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            int salaryCompare = b.getValue().compareTo(a.getValue());
            if(salaryCompare != 0) return salaryCompare;
            return a.getKey().compareTo(b.getKey());
        });
        for (Map.Entry<String,Long> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}