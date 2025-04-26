/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenhateodd;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class EvenHateOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        
        while(testCases-->0){
        long size = scan.nextLong();
        long even =0 , odd = 0 ;
         for (int i = 0; i < size; i++) {
             long value = scan.nextLong();
             if(0 == value %2)
             {
                 even++;
             }
             else{
               odd++;  
             }
             
         }
         if(even == odd)
             {
                 System.out.println(0);
             }else if(0 != size%2)
             {
                 System.out.println(-1);
             }else{
                 System.out.println(Math.abs(even-odd)/2);
             }
        }
    }
    
}
