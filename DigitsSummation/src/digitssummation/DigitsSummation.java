/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitssummation;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class DigitsSummation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        long modRes = num1 % 10 + num2 % 10;

        System.out.println(modRes);
    }

}
