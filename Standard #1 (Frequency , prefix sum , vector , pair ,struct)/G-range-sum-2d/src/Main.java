import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long row = in.nextLong();
        long col = in.nextLong();
        long query = in.nextLong();

        long [][] array = new long[(int)row][(int)col];
        long [][]prefix = new long[(int)row][(int)col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = in.nextLong();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                prefix[i][j] = array[i][j];
                if(i>0)prefix[i][j] += prefix[i-1][j];
                if(j>0)prefix[i][j] += prefix[i][j-1];
                if(i>0&&j>0)prefix[i][j] -= prefix[i-1][j-1];
            }
        }

        while (query-- != 0){
            long r1 = in.nextLong();
            long c1 = in.nextLong();

            long r2 = in.nextLong();
            long c2 = in.nextLong();

            r1--;r2--;c1--;c2--;

            long sum = prefix[(int)r2][(int)c2];
            if(c1>0)sum -= prefix[(int)r2][(int)c1-1];
            if(r1>0)sum -= prefix[(int)r1-1][(int)c2];
            if(r1>0&&c1>0)sum += prefix[(int)r1-1][(int)c1-1];
            System.out.println(sum);

        }
    }
}