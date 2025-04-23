/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * link : https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/U
 */
package isbasubsequenceofa;

import java.util.Scanner;

public class IsBAsubsequenceOfA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sizeOfSequence = scan.nextInt();
        int sizeOfSub = scan.nextInt();

        int[] sequence = new int[sizeOfSequence];
        int[] subSequence = new int[sizeOfSub];

        for (int i = 0; i < sizeOfSequence; i++) {
            sequence[i] = scan.nextInt();
        }

        for (int i = 0; i < sizeOfSub; i++) {
            subSequence[i] = scan.nextInt();
        }

        int z = 0;
        for (int i = 0; i < sizeOfSequence && z < sizeOfSub; i++) {
            if (sequence[i] == subSequence[z]) {
                z++;
            }
        }

        if (z == sizeOfSub)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
