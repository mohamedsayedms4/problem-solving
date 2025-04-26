/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternatingarray;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class AlternatingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
           int value = scan.nextInt();
            arr1[i] = value;
            arr2[i] = value;
        }
        
        int temp1 = 0 , temp2 = 0;
        int counter1 =0 , counter2 = 0;
        arr2[0] *= -1 ;
        counter2++;
        
                for (int i = 0; i < size; i++) {
                    if(0==i)
                    {
                        temp1 = arr1[i];
                        temp2 = arr2[i];
                    }
                    else
                    {
                        if((temp1 > 0 && arr1[i] > 0)||(temp1 < 0 && arr1[i] < 0))
                        {
                            arr1[i] *= -1;
                            counter1++;
                        }
                        
                        if((temp2 > 0 && arr2[i] > 0)||(temp2 < 0 && arr2[i] < 0))
                        {
                            arr2[i] *= -1;
                            counter2++;
                        }
                        temp1 = arr1[i];
                        temp2 = arr2[i];
                    }
                }
                if(counter1 > counter2)
                    System.out.println(counter2);
                else
                    System.out.println(counter1);
        
    }
    
}
