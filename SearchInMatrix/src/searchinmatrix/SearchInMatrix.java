/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
link : https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/S
*/
package searchinmatrix;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class SearchInMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scan = new Scanner(System.in);
                int row = scan.nextInt();
                int column = scan.nextInt();

                long[][] arr = new long[row][column];
                
                for(int i=0; i< row ;i++)
                {
                    for(int j =0 ; j <column ;j++)
                    {
                        arr[i][j]= scan.nextLong();
                    }
                }
                
                int search = scan.nextInt();
                
                boolean flag = false;
                 for(int i=0; i< row ;i++)
                {
                    for(int j =0 ; j <column ;j++)
                    {
                        if(arr[i][j] == search)
                        {
                            flag = true ;
                            break;
                        }
                        if(flag)break;
                    }
                }
                 if(true == flag)
                     System.out.println("will not take number");
                 else
                     System.out.println("will take number");

    }
    
}
