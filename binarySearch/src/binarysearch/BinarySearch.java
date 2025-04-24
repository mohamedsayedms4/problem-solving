/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * link :https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Z
 */
package binarysearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class BinarySearch {
    
    static int binarySearch(int arr[] , int left , int right , int search)
    {
        while(left <= right)
        {
            int mid = left + (right-left)/2 ;
            if(search == arr[mid])
            {
                return mid;
            }else if(search > arr[mid])
            {
                left = mid + 1 ;
            }
            else
            {
                right = mid - 1 ;
            }
        }
        return -1 ;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
                int numSerach = scan.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        Arrays.sort(arr);
        while(numSerach-->0)
        {
            int search = scan.nextInt();
            int result = binarySearch(arr, 0, size-1, search);
            
            if(-1 == result)
                System.out.println("not found");
            else
                System.out.println("found");
        }
    }

}
