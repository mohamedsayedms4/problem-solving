/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * Problem link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/S

 */


//link :    
package matrix;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int [][] arr = new  int [size][size];
        
         for(int i=0; i< size ;i++)
                {
                    for(int j =0 ; j <size ;j++)
                    {
                        arr[i][j]= scan.nextInt();
                    }
                }

                long sum1 =0 ;
                for(int i=0; i< size ;i++)
                {
                    for(int j =0 ; j <size ;j++)
                    {
                        if(i == j)
                        {
                            sum1 += arr[i][j];
                        }
                    }
                }
                long sum2 =0 ;
                for(int i=0; i< size ;i++)
                {
                    for(int j =0 ; j <size ;j++)
                    {
                        if(size-1-j == i)
                        {
                            sum2 += arr[i][j];
                        }
                    }
                }
                
                System.out.println(Math.abs(sum1 - sum2));
                
    }

}
