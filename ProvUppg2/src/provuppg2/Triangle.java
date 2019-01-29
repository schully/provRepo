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
public class Triangle extends Shape{

    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    double area() {
        return (this.height * this.width)/2;
    }
    
}
