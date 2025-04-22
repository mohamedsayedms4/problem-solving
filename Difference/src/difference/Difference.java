/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package difference;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class Difference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        long inputNum1 = scanner.nextInt();
        long inputNum2 = scanner.nextInt();
        long inputNum3 = scanner.nextInt();
        long inputNum4 = scanner.nextInt();

        System.out.printf("Difference = %d", (inputNum1 * inputNum2) - (inputNum3 * inputNum4));
    }

}
