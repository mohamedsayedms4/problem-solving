/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squareorrectangle;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sayed
 */
public class SquareOrRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scan = new Scanner(System.in);
                int counter = scan.nextInt();
                
                while(counter-->0)
                {
                    int w = scan.nextInt();
                    int h = scan.nextInt();
                    
                    if(w == h)
                        System.out.println("Square");
                    else
                        System.out.println("Rectangle");
                }

    }
    
}
