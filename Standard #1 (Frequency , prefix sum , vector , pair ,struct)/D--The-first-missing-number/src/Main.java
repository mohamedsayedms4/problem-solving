import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> hashSet = new HashSet();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            hashSet.add(num);
        }
        for(int i= -m ;i<=m ; i++){
            if (!hashSet.contains(i)){
                System.out.println(i);
                return;
            }
        }
    }
}