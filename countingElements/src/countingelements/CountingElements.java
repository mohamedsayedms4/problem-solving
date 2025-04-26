/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countingelements;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class CountingElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int temp = 0, res = 0, counter = 0;
        for (int i = 0; i < size; i++) {
            if (0 == i) {
                temp = arr[i];
                res = 1;
            } else {
                if (temp == arr[i]) {
                    res++;
                } else if (temp + 1 == arr[i]) {
                    counter += res;
                    temp = arr[i];
                    res =1 ;
                } else {
                    res = 1;
                    temp = arr[i];
                }
            }
        }
        System.out.println(counter);
    }

}
