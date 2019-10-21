/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglecalculator;

import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class TriangleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Insert input 1:");
            x = scanner.nextDouble();
            System.out.println("Insert input 2:");
            y = scanner.nextDouble();
            System.out.println("Insert input 3:");
            z = scanner.nextDouble();
            
            Triangle triangle = new Triangle(x,y,z);
            System.out.println("The result is a " + triangle.toString() + " triangle");
        }
    }
}
