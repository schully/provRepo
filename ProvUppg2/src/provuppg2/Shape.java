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
public abstract class Shape {
    double width;
    double height;

    public Shape() {
    }
    
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    abstract double area();
}
