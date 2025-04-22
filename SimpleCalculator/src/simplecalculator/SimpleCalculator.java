/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);
       
       long inputNum1 = scanner.nextInt();
       long inputNum2 = scanner.nextInt();
       
        System.out.printf("%d + %d = %d\n" , inputNum1 , inputNum2 , inputNum1+inputNum2);
        System.out.printf("%d * %d = %d\n" , inputNum1 , inputNum2 , inputNum1*inputNum2);
        System.out.printf("%d - %d = %d\n" , inputNum1 , inputNum2 , inputNum1-inputNum2);
 
               
    }
    }
    