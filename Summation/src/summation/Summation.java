/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package summation;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class Summation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        long sum = (num * (num + 1)) / 2;

        System.out.println(sum);
    }

}
