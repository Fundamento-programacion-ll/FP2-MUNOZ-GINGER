/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.Comparator;

/**
 *
 * @author Sony Vaio
 */
public class ComparadorHabitantes implements Comparator {
  int compararNombre;
    Provincia provincia1, provincia2;
    @Override
    public int compare(Object o1, Object o2) {
            provincia1 = (Provincia)o1;
        provincia2 = (Provincia)o2;                
        if (provincia1.getNumeroHabitantes()
                > provincia2.getNumeroHabitantes()) {
            compararNombre = 1;
        } else {
            compararNombre =  -1;
        }        
        return compararNombre;
    
    }
    
}
