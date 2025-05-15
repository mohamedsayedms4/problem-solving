import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i =     0; i < s.length(); i++)
        {
            if(s.charAt(i)=='\\')
            {
                break;
            }
            System.out.print(s.charAt(i));
        }
    }
}