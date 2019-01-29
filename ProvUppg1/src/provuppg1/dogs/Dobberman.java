/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provuppg1.dogs;

import provuppg1.interfaces.Guardable;

/**
 *
 * @author Administratör
 */
public class Dobberman extends Dog implements Guardable{

    @Override
    public void guard() {
    }

    @Override
    public String bark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
