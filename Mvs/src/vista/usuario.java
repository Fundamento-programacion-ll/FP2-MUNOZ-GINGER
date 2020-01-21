/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.user;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony Vaio
 */
public class usuario {
    public void menu(){
        user metodos = new user();
        int opcion = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu"+
        "Agregar Persona",this));
        switch(opcion){
            case 1:
               String nombre = JOptionPane
                       .showInputDialog(null,)
                metodos.agregarPersona("Ginger");
                break;
            case 2:
                
                metodos.listaPersonas();
                break;
            default:
                break;
        }
    }
}
