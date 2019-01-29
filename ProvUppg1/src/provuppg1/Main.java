/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provuppg1;

import provuppg1.dogs.Bordercollie;
import provuppg1.dogs.Dog;
import java.util.HashSet;
import java.util.Set;
import provuppg1.dogs.Rottweiler;

/**
 *
 * @author Administratör
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Dog> dogs = new HashSet<>();
        Dog fido = new Rottweiler();
        Dog albert = new Bordercollie();
        System.out.println(fido.equals(albert));
    }
    
}
