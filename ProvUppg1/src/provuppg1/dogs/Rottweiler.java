/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provuppg1.dogs;

import provuppg1.interfaces.Guardable;
import provuppg1.interfaces.Herdable;

/**
 *
 * @author Administratör
 */
public class Rottweiler extends Dog implements Guardable, Herdable {

    @Override
    public void guard() {
    }

    @Override
    public void heard() {
    }

    @Override
    public String bark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
