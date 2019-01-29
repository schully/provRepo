/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provuppg2;

import java.util.Scanner;

/**
 *
 * @author Administratör
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double digit1;
        double digit2;
        Shape shape;
        System.out.println("What shape? 0: Cirlce, 1: Rectangle, 2: Triangle");
        Scanner input = new Scanner(System.in);
        int shapeNum = input.nextInt();
        
        Scanner sc = new Scanner(System.in);
        switch (shapeNum) {
            case 0:
                System.out.println("Enter redius: ");

                digit1 = sc.nextDouble();
                shape = new Circle(digit1);
                System.out.println("Circle Area: " + shape.area());
                break;
            case 1:
                System.out.println("Enter with & height: ");

                digit1 = sc.nextDouble();
                digit2 = sc.nextDouble();
                shape = new Rectangle(digit1,digit2);
                System.out.println("Rectangle Area: " + shape.area());
                break;
            case 2:
                System.out.println("Enter with & height: ");
                
                digit1 = sc.nextDouble();
                digit2 = sc.nextDouble();
                shape = new Triangle(digit1,digit2);
                System.out.println("Triangle Area: " + shape.area());
                break;
            default: System.out.println("problem?");
        }
    }

}
