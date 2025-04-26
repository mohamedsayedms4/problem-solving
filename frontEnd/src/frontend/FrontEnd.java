/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frontend;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class FrontEnd {

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
                for (int i = 0; i < size/2; i++) {
                    System.out.print(arr[i]+" "+arr[size - i -1]+" ");
                }
                if(size%2 != 0)
                {
                    System.out.print(arr[size/2]);
                }
    }
    
}
