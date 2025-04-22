/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaofcircle;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        final double biOfArea = 3.141592653;
        double rOfArea = scanner.nextDouble();
        System.out.println(biOfArea * Math.pow(rOfArea, 2));

    }

}
