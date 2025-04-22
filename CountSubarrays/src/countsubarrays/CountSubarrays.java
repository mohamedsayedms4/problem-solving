/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countsubarrays;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class CountSubarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while (testCases-- > 0) {
            int size = scan.nextInt();
            int res = 0;
            int[] subArra = new int[size];
            for (int i = 0; i < size; i++) {
                subArra[i] = scan.nextInt();
            }
            res = size;
            int itreator = 0, z = 0;
            while (true) {
                
                if(size-1 == z)
                {
                    break;
                }
                if(subArra[itreator]>subArra[itreator+1])
                {
                    z++;
                    itreator=z;
                    continue;
                }
                res++;
                itreator++;
                if (size - 1 == itreator) {
                    z++;
                    itreator = z;
                }
            }
            System.out.println(res);
        }
    }

}
