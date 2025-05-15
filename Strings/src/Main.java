import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();

        System.out.println(s.length() +" "+s1.length());
        String s2 = s + s1 ;
        System.out.println(s2);
        String newS = s1.charAt(0) + s.substring(1);
        String newS1 = s.charAt(0) + s1.substring(1);
        System.out.println(newS + " " + newS1);


    }
}