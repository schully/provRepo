/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provuppg2;

/**
 *
 * @author Administratör
 */
public class Circle extends Shape{

    private double radius;
    private final double PI = 3.1415;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    @Override
    double area() {
        return radius * radius * PI;
    }
    
}
