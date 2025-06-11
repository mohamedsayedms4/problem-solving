
/*
* # E. Range Sum Query

**Time Limit:** 1.5 seconds
**Memory Limit:** 256 megabytes

## Problem Statement

You are given an integer `N` representing the size of an array `A`, and an integer `Q` representing the number of queries.
Each query consists of two integers `L` and `R` and asks for the sum of elements from index `L` to `R` in array `A`.

Your task is to efficiently answer all `Q` queries.

## Input

- The first line contains two integers `N` and `Q` (1 ≤ N, Q ≤ 10⁵) — the number of elements in the array and the number of queries.
- The second line contains `N` integers `A₁, A₂, ..., Aₙ` (1 ≤ Aᵢ ≤ 10⁹) — the elements of the array.
- Each of the next `Q` lines contains two integers `L` and `R` (1 ≤ L ≤ R ≤ N) — the bounds of the query.

## Output

For each query, print a single integer — the sum of elements from index `L` to `R`.

## Example

### Input
6 3
6 4 2 7 2 7
1 3
3 6
1 6

### Output
12
18
28

* */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int query = in.nextInt();

        long[] array = new long[size+1];
        long[] prefixSum = new long[size+1];

        for (int i = 1; i <= size; i++) {
            array[i] = in.nextLong();
            prefixSum[i] = prefixSum[i-1] + array[i];
        }

        while (query-->0) {
            int start = in.nextInt();
            int end = in.nextInt();

            long sum = prefixSum[end] - prefixSum[start - 1];
            System.out.println(sum);
        }
    }
}