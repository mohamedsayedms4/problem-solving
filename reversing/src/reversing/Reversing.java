/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversing;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class Reversing {
    public static void reverse (int []arr ,int start,int end )
    {
        while(start < end)
        {
            arr[start] = arr[start]^arr[end];
            arr[end]   = arr[start]^arr[end];
            arr[start] = arr[start]^arr[end];
            start++;
            end --;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i=0 ; i< size ; i++)
        {
            arr[i]=scan.nextInt();
        }
        
        for(int i=0 ; i< size ; i++)
        {
            if(0 == arr[i])
            {
                reverse(arr, 0, i-1);
            }
        }
        for(int value :arr)
        {
            System.out.print(value+" ");
        }
            
    }

}
