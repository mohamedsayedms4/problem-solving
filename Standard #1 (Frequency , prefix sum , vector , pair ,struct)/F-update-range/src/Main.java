

/*
* F. update range
time limit per test1 second
memory limit per test256 megabytes
you have an array a
 of size n
, and you need to answer q
 queries. each query need you to add the val
 to all numbers from index L
 to index R
.

Input
the first line contains two integer n
 the size of array, and q
 number of queries, (1≤n,q≤105)
.

The second line contains n
 numbers ai(0≤ai≤109)
.

the next q
 lines contains L,R,val(1≤L≤R≤n,1≤val≤109)
.

Output
print the array after updates.

Example
InputCopy
5 3
1 0 1 0 1
1 2 1
3 5 3
1 5 2
OutputCopy
4 3 6 5 6
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int queris = in.nextInt();

        long[] array = new long[size];
        long[] array2 = new long[size + 1];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextLong();
        }

        while (queris-- > 0) {
            int start = in.nextInt() - 1;
            int end = in.nextInt() - 1;
            int addNumber = in.nextInt();

            array2[start] += addNumber;
            if (end + 1 < size) {
                array2[end + 1] -= addNumber;
            }
        }

        for (int i = 1; i < size; i++) {
            array2[i] += array2[i - 1];
        }

        for (int i = 0; i < size; i++) {
            System.out.print((array[i] + array2[i]) + " ");
        }
    }
}
