import java.util.Scanner;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String value = in.nextLine();

        Vector<Long> prefix = new Vector<Long>();

        if(value.charAt(0) == 'a'){
            prefix.add(1L);
        }else {
            prefix.add(0L);
        }

        for(int i = 1; i < value.length(); i++){
            if(value.charAt(i) == 'a'){
                prefix.add(prefix.get(i-1) + 1L);
            }else {
                prefix.add(prefix.get(i-1));
            }
        }

        int testcases = in.nextInt();
        while (testcases-- > 0) {
            int start = in.nextInt();
            int end = in.nextInt();


            if(start==1){
                System.out.println(prefix.get(end-1));
            }else {
                System.out.println(prefix.get(end-1)-prefix.get(start-2));
            }
        }
    }
}