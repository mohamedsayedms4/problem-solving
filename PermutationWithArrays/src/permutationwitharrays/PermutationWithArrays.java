/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package permutationwitharrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class PermutationWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            arr1[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
            arr2[i] = scan.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < size; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        if (true == flag) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }

    }

}
