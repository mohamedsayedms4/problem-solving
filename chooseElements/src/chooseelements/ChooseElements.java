/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chooseelements;

import java.util.*;

public class ChooseElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int num = scan.nextInt();
        long[] arr = new long[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextLong();
        }

        Arrays.sort(arr);
        long max = 0;
        for (int i = size - 1; i >= size - num; i--) {
            if(arr[i] < 0)
                break;
            
            max += arr[i];
        }

        System.out.println(max);
    }
}
