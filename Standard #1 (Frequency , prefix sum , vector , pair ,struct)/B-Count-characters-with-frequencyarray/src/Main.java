import java.util.Scanner;

/*
* # B. Count characters

**Time Limit:** 1 second
**Memory Limit:** 256 megabytes

You have a string `s` that contains Latin letters in **lower and upper case**.

You have to print **every character that appears** in `s` and the **number of its occurrences**.

You must print the letters **sorted**, and the **upper case letters before lower case letters**.

---

## 📥 Input

The only line of input contains a string `s` (`1 ≤ |s| ≤ 10^5`).

---

## 📤 Output

Print each letter that appears in `s`, followed by a space and its count.
Each letter must appear exactly once in output, and the output should be sorted with **uppercase letters first** (i.e., in ASCII order).

---

## 🔍 Example

### Input
ICPCAssuit

### Output
A 1
C 2
I 1
P 1
i 1
s 2
t 1
u 1
*/
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int []frequency = new int[100000];

        for(char c : s.toCharArray())
        {
            frequency[c]++;
        }

        for(char c = 'A'; c <= 'Z'; c++)
        {
            if(frequency[c] >0)
            System.out.println(c + " : " + frequency[c]);
        }

        for (char c = 'a'; c <= 'z'; c++)
        {
            if(frequency[c] >0)
            System.out.println(c + " : " + frequency[c]);
        }
    }
}