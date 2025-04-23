/*
 * Problem Link: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/V
 * Useful Video: https://www.youtube.com/watch?v=1U3Uwct45IY
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package frequencyarray;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class FrequencyArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int counter = scan.nextInt();
        int [] freq = new int[100000];
        for(int i=0 ; i< size ; i++)
        {
            int num = scan.nextInt();
            if(0 == freq[num])
            {
                freq [num] = 1;
            }
            else
            {
                freq[num] = freq[num]+1;
            }
        }
                for(int i=1 ; i<= counter ; i++)
                {
                    System.out.println(freq[i]);
                }

        
        
        // TODO: Write your solution logic here
    }

}
