/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * link : https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Y
 */
package rangesumquery;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class RangesumQuery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int rang = scan.nextInt();

        scan.nextLine();
        long[] arr = new long[size];
        long[] preArr = new long[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextLong();
            if (0 == i) {
                preArr[i] = arr[i];
            } else {
                preArr[i] = preArr[i - 1] + arr[i];
            }

        }
        int start = 0, end = 0;
        long sum = 0;
        for (int i = 0; i < rang; i++) {
            start = scan.nextInt() - 1;
            end = scan.nextInt() - 1;

            sum = preArr[end] - preArr[start] + arr[start];

            System.out.println(sum);
            sum = 0;
        }

        scan.close();

    }

}
