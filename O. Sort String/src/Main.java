import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ascii [] = new int[26];
        int size = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        for (int i = 0; i < size; i++) {
            ascii[(int)str.charAt(i) - 97]++;
        }

        for (int i = 0; i < 25; i++) {
            while (ascii[i] != 0) {
                System.out.print((char)(i+97));
                ascii[i] --;
            }
        }

    }
}